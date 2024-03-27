package com.example.spring_boot_rest_js.service;

import com.example.spring_boot_rest_js.entity.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAll();

    void add(Role role);
}
