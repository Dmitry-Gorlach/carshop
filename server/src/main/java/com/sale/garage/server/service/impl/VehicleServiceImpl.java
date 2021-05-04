package com.sale.garage.server.service.impl;

import com.sale.garage.server.model.Vehicle;
import com.sale.garage.server.repository.VehicleRepository;
import com.sale.garage.server.service.VehicleService;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    VehicleRepository vehicleRepository;

    public VehicleServiceImpl(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public List<Vehicle> findAllSortingByDateAdded() {
        final List<Vehicle> vehicles = vehicleRepository.findAll();
        final Comparator<Vehicle> mapComparator = Comparator.comparing(Vehicle::getDateAdded);
        vehicles.sort(mapComparator);
        return vehicles;
    }
}
