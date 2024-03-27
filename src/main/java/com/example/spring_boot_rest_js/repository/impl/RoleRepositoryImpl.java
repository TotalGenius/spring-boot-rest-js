package com.example.spring_boot_rest_js.repository.impl;

import com.example.spring_boot_rest_js.entity.Role;
import com.example.spring_boot_rest_js.repository.RoleRepository;
import javax.persistence.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RoleRepositoryImpl implements RoleRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Role> getAll() {
        return entityManager
                .createQuery("select r from Role r", Role.class)
                .getResultList();
    }

    @Override
    public Role findByName(String name) {
        return entityManager
                .createQuery("select r from Role r where r.name = ?1", Role.class)
                .setParameter(1, name)
                .getResultList()
                .get(0);
    }

    @Override
    public void save(Role role) {
        entityManager.persist(role);
    }
}
