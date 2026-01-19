package com.spring.bean;

import com.spring.config.VehicleService;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("vehicleBean")
public class Vehicle {

    private String name = "Ferrari";

    private VehicleService vehicleService;

    @Autowired
    public Vehicle(VehicleService vehicleService) {
        System.out.println("Vehicle Bean Has Been Created By SpringContext");
        this.vehicleService=vehicleService;
    }

    public void setVehicleService(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void printHello(){
        System.out.println("Printing hellllo msg from component annotaion pojo");
    }

    @Override
    public String toString() {
        return  "Name of the vehicle is : "+name;
    }
}
