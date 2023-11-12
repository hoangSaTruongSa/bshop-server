package com.vti.bshop.service;

import com.vti.bshop.dto.CarDto;
import com.vti.bshop.entity.Car;
import com.vti.bshop.form.CarCreateForm;
import com.vti.bshop.form.CarUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CarService {
    Page<CarDto> findAll(Pageable pageable);
    CarDto create(CarCreateForm form);
    CarDto update(CarUpdateForm form);
    void deleteById(Car.PrimaryKey pk);
}
