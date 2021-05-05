package com.sale.garage.server.mapstruct.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LocationDto {

    @JsonProperty("lat")
    private Double latitude;

    @JsonProperty("long")
    private Double longitude;

}
