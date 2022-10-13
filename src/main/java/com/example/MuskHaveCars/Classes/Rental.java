package com.example.MuskHaveCars.Classes;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //private Date fromDateX;
    //private Date toDateY;
    private LocalDate fromDate;
    private LocalDate toDate;
    private Integer totalPrice;


    @ManyToOne
    private Car car;

    @ManyToOne
    private Customer customer;

    public Rental() {

    }

    public Rental(LocalDate fromDate, LocalDate toDate, Integer totalPrice) {
        /*this.id = id;*/
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.totalPrice = totalPrice;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "id=" + id +
                ", fromDate=" + fromDate +
                ", toDate=" + toDate +
                ", totalPrice=" + totalPrice +
                ", car=" + car +
                ", customer=" + customer +
                '}';
    }
}
