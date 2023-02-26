package com.example.lanyapro.mapper;

import com.example.lanyapro.vo.TLyUser;

import java.util.List;

/**
* @author 易港
* @description 针对表【t_ly_user(基础权限用户表)】的数据库操作Mapper
* @createDate 2023-02-26 12:32:52
* @Entity com.example.lanyapro.vo.TLyUser
*/
public interface TLyUserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(TLyUser record);

    int insertSelective(TLyUser record);

    TLyUser selectByPrimaryKey(Integer id);

    List<TLyUser> selectByUserName(String userName);

    int updateByPrimaryKeySelective(TLyUser record);

    int updateByPrimaryKey(TLyUser record);

}
