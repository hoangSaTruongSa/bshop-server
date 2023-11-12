package com.vti.bshop.repository;

import com.vti.bshop.entity.Accessory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccessoryRepository extends
        JpaRepository<Accessory, Long> {

}
