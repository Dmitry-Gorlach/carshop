package com.sale.garage.server.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "vehicle")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String make;

    @NonNull
    private String model;

    @NonNull
    @Column(name = "year_model")
    private int yearModel;

    @NonNull
    private Double price;

    private boolean licensed;

    @NonNull
    @Column(name="date_added")
    private LocalDate dateAdded;

    /**
     * Several vehicles may be in the same warehouse.
     */
    @ManyToOne
    @JoinColumn(name = "warehouse_id", nullable = false)
    @JsonIgnore
    private Warehouse warehouse;

    public Vehicle() {
    }
}
