package com.vti.bshop.repository;


import com.vti.bshop.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByType(Role.Type type);
}
