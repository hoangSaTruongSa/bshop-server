package com.vti.bshop.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vti.bshop.entity.Accessory;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class CarDto {
    @JsonProperty("licensePlate")
    private String pkLicensePlate;
    @JsonProperty("repairDate")
    private LocalDate pkRepairDate;
    private String customerName;
    private String catalog;
    private String carMaker;
}
