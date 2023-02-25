package com.example.lanyapro.service.impl;

import com.example.lanyapro.mapper.TLanyaUserMapper;
import com.example.lanyapro.service.LYUserService;
import com.example.lanyapro.vo.TLanyaUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 详细描述:
 * 获取工号实现类
 *
 * @author yigang
 * @version v1.0.0
 * 创建时间：2023/2/25 19:39
 */
@Service
public class LYUserServiceImpl implements LYUserService {

    @Resource
    private TLanyaUserMapper userMapper;

    @Override
    public TLanyaUser getOne(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
