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

    @Column(name = "year_model")
    private int yearModel;

    @NonNull
    private Double price;

    private Boolean licensed;

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

    public Vehicle(Long id, @NonNull String make, @NonNull String model,
                   int yearModel, @NonNull Double price, Boolean licensed,
                   @NonNull LocalDate dateAdded, Warehouse warehouse) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.yearModel = yearModel;
        this.price = price;
        this.licensed = licensed;
        this.dateAdded = dateAdded;
        this.warehouse = warehouse;
    }
}
