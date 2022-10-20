package com.example.MuskHaveCars.Classes;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String address;
    private Long PNR;
    private String email;
    private String phoneNumber;

    private String zipCode;
    private String customerCity;

/* test
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Rental> rentals = new ArrayList<>();
*/
    public Customer() {

    }

    public Customer( String firstName, String lastName, String address, Long PNR, String email, String phoneNumber, String zipCode, String customerCity) {
        /*this.id = id;*/
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.PNR = PNR;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.zipCode = zipCode;
        this.customerCity = customerCity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPNR() {
        return PNR;
    }

    public void setPNR(Long PNR) {
        this.PNR = PNR;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
/*test
    public List<Rental> getRentals() {
        return rentals;
    }

    public void setRentals(List<Rental> rentals) {
        this.rentals = rentals;
    }
*/
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }
}
