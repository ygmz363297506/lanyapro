package com.example.lanyapro.service.impl;

import com.example.lanyapro.mapper.TLyPermissionMapper;
import com.example.lanyapro.mapper.TLyRoleMapper;
import com.example.lanyapro.mapper.TLyUserMapper;
import com.example.lanyapro.service.LYUserService;
import com.example.lanyapro.vo.TLanyaUser;
import com.example.lanyapro.vo.TLyRole;
import com.example.lanyapro.vo.TLyUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

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
    private TLyUserMapper userMapper;
    @Resource
    private TLyPermissionMapper permissionMapper;

    @Override
    public TLanyaUser getOne(Integer id) {
        return new TLanyaUser();
    }

}
