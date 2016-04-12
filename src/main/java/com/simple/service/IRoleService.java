package com.simple.service;

import com.simple.model.Role;

/**
 * @author xiaobianchen
 * @version 1.0 2016/4/12
 */
public interface IRoleService extends IGenericService {

    boolean deleteByRoleName(String roleName);

    Role findByPrimaryKey(String roleName);

    void update(Role role);
}
