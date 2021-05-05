package com.sale.garage.server.model;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

//@Data
//@Entity
public class Cars {

    @Id
    private Long id;
    private String location;
    private List<Vehicle> vehicles = new ArrayList<>();

    public Cars() {
    }
}
