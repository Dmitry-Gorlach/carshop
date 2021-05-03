package com.sale.garage.server.controller;

import com.sale.garage.server.model.Vehicle;
import com.sale.garage.server.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/vehicle")
public class VehicleController {

    @Autowired
    private VehicleRepository vehicleRepository;

    @RequestMapping("/list")
    public List<Vehicle> getVehicles() {
        return vehicleRepository.findAll();
    }

}
