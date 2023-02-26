package com.example.lanyapro.service;

import com.example.lanyapro.vo.TLanyaUser;
import org.springframework.data.relational.core.sql.In;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface LYUserService {
    TLanyaUser getOne(Integer id);

}
