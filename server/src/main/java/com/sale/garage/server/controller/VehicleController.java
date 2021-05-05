package com.sale.garage.server.controller;

import com.sale.garage.server.mapstruct.dtos.VehicleDto;
import com.sale.garage.server.service.VehicleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/vehicle")
public class VehicleController {

    private VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @RequestMapping("/list")
    public ResponseEntity<?> getVehicles() {
        final List<VehicleDto> vehicleDtos = vehicleService.findAllSortingByDateAdded();
        return new ResponseEntity<>(vehicleDtos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getVehicleById(@PathVariable final Long id) {
        VehicleDto vehicleDto = vehicleService.findById(id);
        return vehicleDto == null ?
                new ResponseEntity<>(HttpStatus.NOT_FOUND) :
                ResponseEntity.ok().body(vehicleDto);
    }

}
