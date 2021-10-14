package com.example.findme;

import com.example.findme.pojo.User;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.core.EntityInformation;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class UserRepository extends SimpleJpaRepository<User, Integer> {

    private final EntityManager entityManager;

    public UserRepository(JpaEntityInformation<User, ?> entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);
        this.entityManager = entityManager;
    }

    public UserRepository(Class<User> domainClass, EntityManager em) {
        super(domainClass, em);
        this.entityManager = em;
    }
}
