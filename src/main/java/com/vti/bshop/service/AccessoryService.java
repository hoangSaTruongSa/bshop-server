package com.vti.bshop.service;

import com.vti.bshop.dto.AccessoryDto;
import com.vti.bshop.form.AccessoryCreateForm;
import com.vti.bshop.form.AccessoryUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface AccessoryService {
    Page<AccessoryDto> findAll(Pageable pageable);
    AccessoryDto update(Long id, AccessoryUpdateForm form);
    void deleteById(Long id);
    AccessoryDto create(AccessoryCreateForm form);
}
