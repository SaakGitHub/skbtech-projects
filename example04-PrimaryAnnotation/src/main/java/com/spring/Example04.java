package com.spring;

import com.spring.bean.Vehicle;
import com.spring.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example04 {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh1 = context.getBean(Vehicle.class);
        System.out.println("Name of the vehicle is "+veh1.getName());

        String hello = context.getBean(String.class);
        System.out.println(hello);

        Integer num=  context.getBean(Integer.class);
        System.out.println(num );

    }
}