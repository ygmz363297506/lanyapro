package com.example.lanyapro.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

/**
 * 详细描述: 角色
 *
 * @author yigang
 * @version v1.0.0
 * 创建时间：2023/2/26 12:08
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LYRole implements Serializable {
    private Integer id;     //角色id
    private String name;    //角色名称
    private String keyWord; //角色关键字
    private String description; //角色描述
    private Set<LYPermission> permissionList;    //用户权限集合
}
