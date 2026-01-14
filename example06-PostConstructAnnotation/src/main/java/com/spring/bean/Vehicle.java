package com.spring.bean;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   /* @PostConstruct is a lifecycle callback annotation used to execute initialization logic
       after a bean has been created and all dependencies have been injected.

        What @PostConstruct Does
        ========================
        It marks a method that runs once, immediately after:

        The bean is instantiated

        Dependency Injection is completed

        It is part of the Jakarta Annotations API

        Commonly used for initialization logic, not for business logic*/

    @PostConstruct
    public void initialize(){
        this.name="Honda";
    }
    public void printHello(){
        System.out.println("Printing hellllo msg from component annotaion pojo");
    }

    @Override
    public String toString() {
        return  name;
    }
}
