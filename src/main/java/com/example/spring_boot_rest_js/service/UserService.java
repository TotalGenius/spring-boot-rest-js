package com.example.spring_boot_rest_js.service;

import com.example.spring_boot_rest_js.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAll();

    User findByEmail(String email);

    User getById(Long id);

    void deleteById(Long id);

    void save(User user);

    void update(User user);
}
