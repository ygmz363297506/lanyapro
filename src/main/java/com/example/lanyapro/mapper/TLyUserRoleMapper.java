package com.example.lanyapro.mapper;

import com.example.lanyapro.vo.TLyUserRole;

/**
* @author 易港
* @description 针对表【t_ly_user_role】的数据库操作Mapper
* @createDate 2023-02-26 12:32:58
* @Entity com.example.lanyapro.vo.TLyUserRole
*/
public interface TLyUserRoleMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(TLyUserRole record);

    int insertSelective(TLyUserRole record);

    TLyUserRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TLyUserRole record);

    int updateByPrimaryKey(TLyUserRole record);

}
