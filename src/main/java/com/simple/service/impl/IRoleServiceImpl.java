package com.simple.service.impl;

import com.simple.maper.RoleMapper;
import com.simple.model.Role;
import com.simple.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xiaobianchen
 * @version 1.0 2016/4/12
 */
@Service("roleService")
public class IRoleServiceImpl implements IRoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    @SuppressWarnings("unchecked")
    public void insert(Object obj) {
        roleMapper.insert(obj);
    }

    @Override
    public List listAll() {
        return roleMapper.listAll();
    }

    @Override
    public boolean deleteByRoleName(String roleName) {
        return roleMapper.deleteByRoleName(roleName);
    }

    @Override
    public Role findByPrimaryKey(String roleName) {
        return roleMapper.findByPrimaryKey(roleName);
    }

    @Override
    public void update(Role role) {
        roleMapper.update(role);
    }
}
