package com.example.springbootjwtsecurity.repository;

import com.example.springbootjwtsecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

// TODO: 3
@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);

    @Query("select u from User u where u.email = :email or u.username = :email")
    Optional<User> findByUsernameOrEmail(@Param(value = "email") String email);

    boolean existsByEmail(String email);

    boolean existsByUsername(String username);
}