package com.sale.garage.server.mapstruct.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sale.garage.server.model.Warehouse;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class VehicleDto {

    @JsonProperty("id")
    private Long id;

    @NonNull
    @JsonProperty("make")
    private String make;

    @NonNull
    @JsonProperty("model")
    private String model;

    @JsonProperty("year_model")
    private int yearModel;

    @NonNull
    @JsonProperty("price")
    private Double price;

    @JsonProperty("licensed")
    private Boolean licensed;

    @NonNull
    @JsonProperty("date_added")
    private LocalDate dateAdded;

    @NonNull
    @JsonProperty("warehouse")
    private Warehouse warehouse;
}
