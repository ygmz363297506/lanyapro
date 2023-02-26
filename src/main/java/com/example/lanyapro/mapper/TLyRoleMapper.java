package com.example.lanyapro.mapper;

import com.example.lanyapro.vo.TLyRole;
import org.springframework.data.relational.core.sql.In;

import java.util.List;

/**
* @author 易港
* @description 针对表【t_ly_role】的数据库操作Mapper
* @createDate 2023-02-26 12:33:06
* @Entity com.example.lanyapro.vo.TLyRole
*/
public interface TLyRoleMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(TLyRole record);

    int insertSelective(TLyRole record);

    TLyRole selectByPrimaryKey(Integer id);

    List<TLyRole> selectListByUserId(Integer userId);

    int updateByPrimaryKeySelective(TLyRole record);

    int updateByPrimaryKey(TLyRole record);

}
