package com.sale.garage.server.model;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="warehouse")
public class Warehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String name;

    /**
     * One warehouse can have only one location.
     */
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "location_id")
    private Location location;

    /**
     * One warehouse may have many vehicles.
     */

    @OneToMany (mappedBy="warehouse", fetch = FetchType.EAGER)

    private List<Vehicle> vehicles;

    public Warehouse() {
    }
}
