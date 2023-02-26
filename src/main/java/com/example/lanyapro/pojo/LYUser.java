package com.example.lanyapro.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * 详细描述: 权限基础类
 * @author yigang
 * @version v1.0.0
 * 创建时间：2023/2/26 12:06
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
public class LYUser implements Serializable {
    private Integer id; //用户id
    private String username;    //用户账号
    private String password;    //用户密码
    private String addUser;     //添加用户人员账号
    private String editUser;  //编辑用户人员账号
    private Date addDate;   //添加账号时间
    private Date updateDate;    //更新账号时间
    private Set<LYRole> role;  //用户角色
}
