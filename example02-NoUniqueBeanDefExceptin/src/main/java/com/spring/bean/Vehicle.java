package com.spring.bean;

public class Vehicle {

    private String vehicle;

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return  vehicle;
    }
}
