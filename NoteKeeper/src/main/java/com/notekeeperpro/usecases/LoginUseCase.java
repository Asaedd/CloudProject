package com.notekeeperpro.usecases;

import com.notekeeperpro.core.Model.User;
import com.notekeeperpro.core.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginUseCase {

    private final UserRepository userRepository;

    public LoginUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User execute(String email, String password) {
        Optional<User> optionalUser = userRepository.findByEmail(email);

        if (!optionalUser.isPresent()) {
            throw new RuntimeException("User not found");
        }
        

        User user = optionalUser.get();

        if (!user.getPassword().equals(password)) {
            throw new RuntimeException("Incorrect password");
        }

        return user;
    }
}
