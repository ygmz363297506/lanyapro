package com.example.lanyapro.service.impl;

import com.example.lanyapro.mapper.TLyPermissionMapper;
import com.example.lanyapro.mapper.TLyUserMapper;
import com.example.lanyapro.service.LYUserService;
import com.example.lanyapro.vo.TLanyaUser;
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
 * 该接口只提供了一个方法：该方法很容易理解：通过用户名来加载用户。这个方法主要用于从系统数
 * 据中查询并加载具体的用户到Spring Security中
 * @author yigang
 * @version v1.0.0
 * 创建时间：2023/2/25 19:39
 */
@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

    @Resource
    private TLyUserMapper userMapper;
    @Resource
    private TLyPermissionMapper permissionMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<TLyUser> user = userMapper.selectByUserName(username);
        if (user == null) {
            throw new UsernameNotFoundException("not found");
        }
        //定义权限列表.
        List<GrantedAuthority> authorities = new ArrayList<>();
        List<String> permissions = permissionMapper.selectListByUserId(user.get(0).getId());
        // 用户可以访问的资源名称（或者说用户所拥有的权限） 注意：必须"ROLE_"开头
        if (!CollectionUtils.isEmpty(permissions)){
            for (String perm: permissions) {
                authorities.add(new SimpleGrantedAuthority(perm));
            }
        }
        org.springframework.security.core.userdetails.User user1 = new org.springframework.security.core.userdetails.User(user.get(0).getUsername(), user.get(0).getPassword(), authorities);
        return user1;
    }
}
