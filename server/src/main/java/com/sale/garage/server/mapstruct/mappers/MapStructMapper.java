package com.sale.garage.server.mapstruct.mappers;

import com.sale.garage.server.mapstruct.dtos.LocationDto;
import com.sale.garage.server.mapstruct.dtos.VehicleDto;
import com.sale.garage.server.mapstruct.dtos.WarehouseDto;
import com.sale.garage.server.model.Location;
import com.sale.garage.server.model.Vehicle;
import com.sale.garage.server.model.Warehouse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MapStructMapper {

    LocationDto locationToLocationDto(final Location location);

    VehicleDto vehicleToVehicleDto(Vehicle vehicle);

    WarehouseDto warehouseToWarehouseDto(final Warehouse warehouse);

    List<LocationDto> locationsToLocationALLDtos(final List<Location> locations);

    List<VehicleDto> vehiclesToVehicleAllDtos(final List<Vehicle> vehicles);

    List<WarehouseDto> warehousesToWarehouseAllDtos(final List<Warehouse> warehouses);
}
