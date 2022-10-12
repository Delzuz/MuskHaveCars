package com.example.MuskHaveCars.Classes;

import java.util.Date;

public class StartInfo {
    private String location;
    private Date from;
    private Date to;


    public StartInfo() {
    }

    public StartInfo(String location, Date from, Date to) {
        this.location = location;
        this.from = from;
        this.to = to;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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
                "location='" + location + '\'' +
                ", from=" + from +
                ", to=" + to +
                '}';
    }
}
