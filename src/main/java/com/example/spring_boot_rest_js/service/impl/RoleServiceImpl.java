package com.example.spring_boot_rest_js.service.impl;

import com.example.spring_boot_rest_js.entity.Role;
import com.example.spring_boot_rest_js.repository.RoleRepository;
import com.example.spring_boot_rest_js.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<Role> getAll() {
        return roleRepository.getAll();
    }

    @Override
    public void add(Role role) {
        roleRepository.save(role);
    }
}
