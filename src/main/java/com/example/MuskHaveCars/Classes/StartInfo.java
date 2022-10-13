package com.example.MuskHaveCars.Classes;

import java.util.Date;

public class StartInfo {

    private Integer IDlocation;
    private Date from;
    private Date to;

    private Integer IDcar;

    private Integer IDcustomer;


    public StartInfo() {
    }

    public StartInfo(Integer location, Date from, Date to) {
        this.IDlocation = location;
        this.from = from;
        this.to = to;
    }

    public Integer getLocation() {
        return IDlocation;
    }

    public void setLocation(Integer location) {
        this.IDlocation = location;
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "StartInfo{" +
                "location='" + IDlocation + '\'' +
                ", from=" + from +
                ", to=" + to +
                '}';
    }
}
