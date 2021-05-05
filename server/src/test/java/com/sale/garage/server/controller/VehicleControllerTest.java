package com.sale.garage.server.controller;

import com.sale.garage.server.mapstruct.dtos.VehicleDto;
import com.sale.garage.server.model.Warehouse;
import com.sale.garage.server.service.VehicleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(VehicleController.class)
public class VehicleControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private VehicleService service;

    @Test
    public void givenVehicles_whenGetVehicles_thenReturnJsonArray()
            throws Exception {

        Warehouse warehouse = new Warehouse(1L, "Warahouse GG");
        LocalDate date = LocalDate.parse("2020-01-08");

        VehicleDto vehicle = new VehicleDto();
        vehicle.setId(1L);
        vehicle.setMake("Toyota");
        vehicle.setModel("Camry");
        vehicle.setYearModel(2019);
        vehicle.setPrice(29.12);
        vehicle.setLicensed(true);
        vehicle.setDateAdded(date);
        vehicle.setWarehouse(warehouse);

        VehicleDto vehicleTwo = new VehicleDto();
        vehicleTwo.setId(2L);
        vehicleTwo.setMake("Tesla");
        vehicleTwo.setModel("S");
        vehicleTwo.setYearModel(2019);
        vehicleTwo.setPrice(29.52);
        vehicleTwo.setLicensed(true);
        vehicleTwo.setDateAdded(date);
        vehicleTwo.setWarehouse(warehouse);

        List<VehicleDto> allVehicles = Arrays.asList(vehicle, vehicleTwo);

        given(service.findAllSortingByDateAdded()).willReturn(allVehicles);

        mvc.perform(get("/api/vehicle/list")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(2)))
                .andExpect(jsonPath("$[0].make", is(vehicle.getMake())));
    }
}