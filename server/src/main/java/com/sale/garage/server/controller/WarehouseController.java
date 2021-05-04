package com.sale.garage.server.controller;

import com.sale.garage.server.model.Warehouse;
import com.sale.garage.server.repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/warehouse")
public class WarehouseController {

    @Autowired
    WarehouseRepository warehouseRepository;

    @RequestMapping("/list")
    public List<Warehouse> getWarehouses() {
        return warehouseRepository.findAll();
    }
}
