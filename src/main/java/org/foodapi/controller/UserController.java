package org.foodapi.controller;

import lombok.AllArgsConstructor;
import org.foodapi.dtos.UserRequest;
import org.foodapi.dtos.UserResponse;
import org.foodapi.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class UserController {
    private final UserService userService;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponse register(@RequestBody UserRequest request) {
        return userService.registerUser(request);
    }
}
