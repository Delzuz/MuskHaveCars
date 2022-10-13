package com.example.MuskHaveCars.Classes;

import java.util.Date;

public class StartInfo {

    private Integer IDlocation;
    private String from;
    private String to;

    private Integer IDcar;



    public StartInfo() {
    }

    public StartInfo(Integer IDlocation, String from, String to) {
        this.IDlocation = IDlocation;
        this.from = from;
        this.to = to;
    }

    public StartInfo(Integer IDlocation, String from, String to, Integer IDcar) {
        this.IDlocation = IDlocation;
        this.from = from;
        this.to = to;
        this.IDcar = IDcar;
    }

    public Integer getLocation() {
        return IDlocation;
    }

    public void setLocation(Integer location) {
        this.IDlocation = location;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Integer getIDlocation() {
        return IDlocation;
    }

    public void setIDlocation(Integer IDlocation) {
        this.IDlocation = IDlocation;
    }

    public Integer getIDcar() {
        return IDcar;
    }

    public void setIDcar(Integer IDcar) {
        this.IDcar = IDcar;
    }

    @Override
    public String toString() {
        return "StartInfo{" +
                "IDlocation=" + IDlocation +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", IDcar=" + IDcar +
                '}';
    }
}
