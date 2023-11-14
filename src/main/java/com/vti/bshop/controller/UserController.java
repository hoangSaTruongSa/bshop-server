package com.vti.bshop.controller;

import com.vti.bshop.dto.UserDto;
import com.vti.bshop.entity.User;
import com.vti.bshop.form.UserCreateForm;
import com.vti.bshop.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
public class UserController {
    private final UserService userService;

    @GetMapping("/api/v1/login")
    public UserDto login(Principal principal)
    {
        String username = principal.getName();
        return userService.getUserByUserName(username);
    }

    @PostMapping("/api/v1/users")
    @ResponseStatus(HttpStatus.CREATED)
    public UserDto create(@RequestBody UserCreateForm form)
    {
        return userService.create(form);
    }

}
