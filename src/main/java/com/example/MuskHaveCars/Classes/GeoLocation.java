package com.example.MuskHaveCars.Classes;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "GeoLocation")
public class GeoLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cityName;

    @OneToMany(mappedBy = "geoLocation", cascade = CascadeType.ALL)
    private List<CarLocation> carLocations = new ArrayList<>();

    public GeoLocation() {

    }

    public GeoLocation(Long id, String cityName) {
        this.id = id;
        this.cityName = cityName;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public List<CarLocation> getCarLocations() {
        return carLocations;
    }

    public void setCarLocations(List<CarLocation> carLocations) {
        this.carLocations = carLocations;
    }
}
