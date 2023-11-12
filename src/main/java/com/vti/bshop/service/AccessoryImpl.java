package com.vti.bshop.service;

import com.vti.bshop.dto.AccessoryDto;
import com.vti.bshop.entity.Accessory;
import com.vti.bshop.entity.Car;
import com.vti.bshop.form.AccessoryCreateForm;
import com.vti.bshop.form.AccessoryUpdateForm;
import com.vti.bshop.repository.AccessoryRepository;
import com.vti.bshop.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccessoryImpl implements AccessoryService{
    private final AccessoryRepository accessoryRepository;
    private final CarRepository carRepository;
    private final ModelMapper modelMapper;

    @Override
    public Page<AccessoryDto> findAll(Pageable pageable) {
        return accessoryRepository.findAll(pageable)
                .map(accessory -> modelMapper.map(accessory, AccessoryDto.class));
    }

    @Override
    public AccessoryDto update(Long id, AccessoryUpdateForm form) {
        var accessory = accessoryRepository.findById(id).get();
        modelMapper.map(form, accessory);
        var saveAccessory = accessoryRepository.save(accessory);
        return modelMapper.map(saveAccessory, AccessoryDto.class);
    }

    @Override
    public void deleteById(Long id) {
        accessoryRepository.deleteById(id);
    }

    @Override
    public AccessoryDto create(AccessoryCreateForm form) {
        var accessory = modelMapper.map(form, Accessory.class);
        var pk = modelMapper.map(form, Car.PrimaryKey.class);
        var car = carRepository.findById(pk).get();
        accessory.setCar(car);
        var saveAccessory = accessoryRepository.save(accessory);
        return modelMapper.map(saveAccessory, AccessoryDto.class);
    }
}
