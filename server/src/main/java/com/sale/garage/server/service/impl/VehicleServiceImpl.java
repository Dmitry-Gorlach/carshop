package com.sale.garage.server.service.impl;

import com.sale.garage.server.mapstruct.dtos.VehicleDto;
import com.sale.garage.server.mapstruct.mappers.MapStructMapper;
import com.sale.garage.server.repository.VehicleRepository;
import com.sale.garage.server.service.VehicleService;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    private VehicleRepository vehicleRepository;
    private MapStructMapper mapStructMapper;

    public VehicleServiceImpl(VehicleRepository vehicleRepository, MapStructMapper mapStructMapper) {
        this.vehicleRepository = vehicleRepository;
        this.mapStructMapper = mapStructMapper;
    }

    @Override
    public List<VehicleDto> findAllSortingByDateAdded() {
        final List<VehicleDto> vehicles = mapStructMapper.vehiclesToVehicleAllDtos(vehicleRepository.findAll());
        final Comparator<VehicleDto> mapComparator = Comparator.comparing(VehicleDto::getDateAdded);
        vehicles.sort(mapComparator);
        return vehicles;
    }

    @Override
    public VehicleDto findById(final Long id) {
        return vehicleRepository.findById(id).isPresent()
                ? mapStructMapper.vehicleToVehicleDto(vehicleRepository.findById(id).get()) : null;
    }
}
