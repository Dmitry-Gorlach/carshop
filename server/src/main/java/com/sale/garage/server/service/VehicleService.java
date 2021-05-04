package com.sale.garage.server.service;

import com.sale.garage.server.model.Vehicle;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VehicleService {

    List<Vehicle> findAllSortingByDateAdded();
}
