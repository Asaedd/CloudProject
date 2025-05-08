package com.notekeeperpro.web.Controller;

import com.notekeeperpro.core.Model.User;
import com.notekeeperpro.usecases.LoginUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final LoginUseCase loginUseCase;

    public UserController(LoginUseCase loginUseCase) {
        this.loginUseCase = loginUseCase;
    }

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody LoginRequest request) {
        User user = loginUseCase.execute(request.email, request.password);
        return ResponseEntity.ok(user);
    }

    public static class LoginRequest {
        public String email;
        public String password;
    }
}
