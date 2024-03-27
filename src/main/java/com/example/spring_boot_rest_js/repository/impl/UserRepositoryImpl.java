package com.example.spring_boot_rest_js.repository.impl;

import com.example.spring_boot_rest_js.entity.User;
import com.example.spring_boot_rest_js.repository.UserRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.HashSet;
import java.util.Set;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Set<User> getAll() {
        return new HashSet<>(entityManager
                .createQuery("select u from User u left join fetch u.roles", User.class)
                .getResultList());
    }

    @Override
    public User getById(Long id) {
        return entityManager
                .createQuery("select u from User u left join fetch u.roles where u.id= ?1", User.class)
                .setParameter(1, id)
                .getSingleResult();
    }

    @Override
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    public void deleteById(Long id) {
        entityManager
                .createQuery("delete from User u where u.id= ?1")
                .setParameter(1, id)
                .executeUpdate();
    }

    @Override
    public User getByUsername(String username) {
        return entityManager
                .createQuery("select u from User u left join fetch u.roles where u.email= ?1", User.class)
                .setParameter(1, username)
                .getSingleResult();
    }

    @Override
    public void update(User user) {
        entityManager.merge(user);
    }
}
