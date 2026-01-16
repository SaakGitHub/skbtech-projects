package com.spring.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    public Vehicle() {
        System.out.println("Vehicle Bean Has Been Created By SpringContext");
    }

    private String name;

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
