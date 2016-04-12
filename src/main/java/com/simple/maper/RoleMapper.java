package com.simple.maper;

import com.simple.model.Role;

/**
 * @author xiaobianchen
 * @version 1.0 2016/4/12
 * 角色管理
 */
public interface RoleMapper extends IGenericMapper {

    boolean deleteByRoleName(String roleName);

    Role findByPrimaryKey(String roleName);

    void update(Role role);

}
