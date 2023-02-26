package com.example.lanyapro.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 详细描述: 权限
 *
 * @author yigang
 * @version v1.0.0
 * 创建时间：2023/2/26 12:09
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LYPermission implements Serializable {
    private Integer id;     //权限id
    private String name;    //权限名称
    private String keyWord; //权限关键字
    private String description; //权限描述

}
