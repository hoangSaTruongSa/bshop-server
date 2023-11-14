package com.vti.bshop.service;

import com.vti.bshop.dto.UserDto;
import com.vti.bshop.form.UserCreateForm;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    UserDto create(UserCreateForm form);

    UserDto getUserByUserName(String username);
}
