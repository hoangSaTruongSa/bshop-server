package com.vti.bshop.dto;

import com.vti.bshop.entity.Role;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoleDto {
    private Long id;
    private Role.Type type;
}
