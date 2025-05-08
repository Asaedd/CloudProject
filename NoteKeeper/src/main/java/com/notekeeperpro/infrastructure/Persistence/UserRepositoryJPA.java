package com.notekeeperpro.infrastructure.Persistence;

import com.notekeeperpro.core.Model.User;
import com.notekeeperpro.core.Repository.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepositoryJPA extends UserRepository, JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
    Optional<User> findById(Long id);
}
