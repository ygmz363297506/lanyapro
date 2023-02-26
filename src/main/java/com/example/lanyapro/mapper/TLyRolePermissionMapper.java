package com.example.lanyapro.mapper;

import com.example.lanyapro.vo.TLyRolePermission;

/**
* @author 易港
* @description 针对表【t_ly_role_permission】的数据库操作Mapper
* @createDate 2023-02-26 12:33:03
* @Entity com.example.lanyapro.vo.TLyRolePermission
*/
public interface TLyRolePermissionMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(TLyRolePermission record);

    int insertSelective(TLyRolePermission record);

    TLyRolePermission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TLyRolePermission record);

    int updateByPrimaryKey(TLyRolePermission record);

}
