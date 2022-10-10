package com.example.MuskHaveCars.Classes;

import javax.persistence.*;

@Entity
@Table(name = "GeoLocation")
public class GeoLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cityName;

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
}
