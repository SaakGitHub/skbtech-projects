package com.spring;

import com.spring.bean.Vehicle;
import com.spring.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Name of the vehicle is "+vehicle);


        String hello = context.getBean(String.class);
        System.out.println(hello);

        Integer num=  context.getBean(Integer.class);
        System.out.println(num );

    }
}