package com.notekeeperpro.core.Repository;

import com.notekeeperpro.core.Model.User;

import java.util.Optional;

public interface UserRepository{
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
    Optional<User> findById(Long id);
}
