package com.example.spring_boot_rest_js.repository;

import com.example.spring_boot_rest_js.entity.User;

import java.util.Set;

public interface UserRepository {
    Set<User> getAll();

    User getById(Long id);

    void save(User user);

    void deleteById(Long id);

    User getByUsername(String username);
    void update(User user);
}
