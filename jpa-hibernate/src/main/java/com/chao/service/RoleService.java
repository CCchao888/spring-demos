package com.chao.service;

import com.chao.model.Role;

public interface RoleService {

    Role create(Role role);

    Role findById(Long id);

    void delete(Long id);
}
