package com.spring.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
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


  /*  @PreDestroy is a lifecycle callback annotation in Spring used to execute cleanup
        logic just before a bean is destroyed by the Spring container.
        Use @PreDestroy to:

        Close database connections

        Release resources (files, sockets, threads)

        Stop background tasks or schedulers

        Perform graceful shutdown logic*/

    @PreDestroy
    public void destroy(){
        System.out.println("Vehicle Bean Destroyed");
    }
    public void printHello(){
        System.out.println("Printing hellllo msg from component annotaion pojo");
    }

    @Override
    public String toString() {
        return  name;
    }
}
