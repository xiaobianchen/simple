package com.simple.model;

/**
 * @author xiaobianchen
 * @version 1.0 2016/4/12
 *
 * 角色管理类
 */
public class Role {
    private String roleName;//角色名称
    private String roleDesc;//角色描述

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleName='" + roleName + '\'' +
                ", roleDesc='" + roleDesc + '\'' +
                '}';
    }
}
