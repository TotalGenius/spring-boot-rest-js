package com.example.spring_boot_rest_js.repository;

import com.example.spring_boot_rest_js.entity.Role;

import java.util.List;

public interface RoleRepository {
    List<Role> getAll();

    Role findByName(String name);

    void save(Role role);
}
