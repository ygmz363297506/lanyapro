package com.example.lanyapro.mapper;

import com.example.lanyapro.vo.TLyPermission;

import java.util.List;

/**
* @author 易港
* @description 针对表【t_ly_permission】的数据库操作Mapper
* @createDate 2023-02-26 13:22:56
* @Entity com.example.lanyapro.vo.TLyPermission
*/
public interface TLyPermissionMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(TLyPermission record);

    int insertSelective(TLyPermission record);

    TLyPermission selectByPrimaryKey(Integer id);

    List<String> selectListByUserId(Integer id);

    int updateByPrimaryKeySelective(TLyPermission record);

    int updateByPrimaryKey(TLyPermission record);

}
