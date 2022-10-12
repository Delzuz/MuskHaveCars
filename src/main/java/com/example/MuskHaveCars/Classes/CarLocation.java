package com.example.MuskHaveCars.Classes;

import javax.persistence.*;

@Entity
public class CarLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //private Long carIdToLocation;
    //private Long locationId;
    private Integer quantity;


    @ManyToOne
    private Car car;

    @ManyToOne
    private GeoLocation geoLocation;

    public CarLocation () {

    }

    public CarLocation(Long id, Integer quantity) {
        this.id = id;
        this.quantity = quantity;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public GeoLocation getGeoLocation() {
        return geoLocation;
    }

    public void setGeoLocation(GeoLocation geoLocation) {
        this.geoLocation = geoLocation;
    }
}
