package com.example.MuskHaveCars.Classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CarLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carLocationId;
    private Long carId;
    private Long locationId;
    private Integer quantity;

    public CarLocation () {

    }

    public CarLocation(Long carLocationId, Long carId, Long locationId, Integer quantity) {
        this.carLocationId = carLocationId;
        this.carId = carId;
        this.locationId = locationId;
        this.quantity = quantity;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Long getCarLocationId() {
        return carLocationId;
    }

    public void setCarLocationId(Long carLocationId) {
        this.carLocationId = carLocationId;
    }
}
