package com.example.MuskHaveCars.Classes;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class CarSegment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String segmentName;
    private Integer price;
    private String description;

    @OneToMany(mappedBy = "carSegment", cascade = CascadeType.ALL)
    private List<Car> cars = new ArrayList<>();


    public CarSegment() {

    }

    public CarSegment(Long id, String segmentName, Integer price, String description) {
        this.id = id;
        this.segmentName = segmentName;
        this.price = price;
        this.description = description;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSegmentName() {
        return segmentName;
    }

    public void setSegmentName(String segmentName) {
        this.segmentName = segmentName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
