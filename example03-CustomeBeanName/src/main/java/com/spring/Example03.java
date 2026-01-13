package com.spring;

import com.spring.bean.Vehicle;
import com.spring.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example03 {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh1 = context.getBean("toyotaVehicle",Vehicle.class);
        System.out.println("Name of the vehicle is "+veh1.getName());

        Vehicle veh2 = context.getBean("audiVehicle",Vehicle.class);
        System.out.println("Name of the vehicle is "+veh2.getName());

        Vehicle veh3 = context.getBean("ferrariVehicle",Vehicle.class);
        System.out.println("Name of the vehicle is "+veh3.getName());


        String hello = context.getBean(String.class);
        System.out.println(hello);

        Integer num=  context.getBean(Integer.class);
        System.out.println(num );

    }
}