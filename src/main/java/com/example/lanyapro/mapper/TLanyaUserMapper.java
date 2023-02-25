package com.example.lanyapro.mapper;

import com.example.lanyapro.vo.TLanyaUser;

/**
* @author 易港
* @description 针对表【t_lanya_user】的数据库操作Mapper
* @createDate 2023-02-25 19:35:20
* @Entity com.example.lanyapro.vo.TLanyaUser
*/
public interface TLanyaUserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TLanyaUser record);

    int insertSelective(TLanyaUser record);

    TLanyaUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TLanyaUser record);

    int updateByPrimaryKey(TLanyaUser record);

}
