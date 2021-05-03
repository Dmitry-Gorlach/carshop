package com.sale.garage.server.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "location")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double latitude;

    private Double longitude;

    /**
     * One Location can have only one warehouse.
     */
    @OneToOne (mappedBy="location")
    @JsonIgnore
    private Warehouse warehouse;
}
