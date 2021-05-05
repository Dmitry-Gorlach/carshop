package com.sale.garage.server.mapstruct.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class WarehouseDto {

    @JsonProperty("id")
    private Long id;

    @NonNull
    @JsonProperty("name")
    private String name;

    @NonNull
    @JsonProperty("location")
    private LocationDto location;

    @JsonProperty("vehicles")
    private List<VehicleDto> vehicles;

}
