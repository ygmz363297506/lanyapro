package com.example.lanyapro.service;

import com.example.lanyapro.vo.TLanyaUser;
import org.springframework.data.relational.core.sql.In;

public interface LYUserService {
    public TLanyaUser getOne(Integer id);
}
