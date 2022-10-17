package com.example.MuskHaveCars.Classes;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String carName;
    private String description;
    private Integer range;
/* test
    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
    private List<Rental> rentals = new ArrayList<>();
*/
    /*
    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
    private List<CarLocation> carLocations = new ArrayList<>();
*/
    @ManyToOne
    private CarSegment carSegment;

    public Car() {

    }

    public Car(Long id, String carName, String description, Integer range) {
        this.id = id;
        this.carName = carName;
        this.description = description;
        this.range = range;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getRange() {
        return range;
    }

    public void setRange(Integer range) {
        this.range = range;
    }
/* test
    public List<Rental> getRentals() {
        return rentals;
    }

    public void setRentals(List<Rental> rentals) {
        this.rentals = rentals;
    }


    public List<CarLocation> getCarLocations() {
        return carLocations;
    }

    public void setCarLocations(List<CarLocation> carLocations) {
        this.carLocations = carLocations;
    }
    */


    public CarSegment getCarSegment() {
        return carSegment;
    }

    public void setCarSegment(CarSegment carSegment) {
        this.carSegment = carSegment;
    }
}
