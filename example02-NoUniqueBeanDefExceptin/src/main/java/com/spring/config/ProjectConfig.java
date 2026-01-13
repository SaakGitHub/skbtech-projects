package com.spring.config;

import com.spring.bean.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    Vehicle vehicle1(){
        var veh = new Vehicle();
        veh.setVehicle("Toyota Supra");
        return veh;
    }

    @Bean
    Vehicle vehicle2(){
        var veh = new Vehicle();
        veh.setVehicle("Audi8");
        return veh;
    }

    @Bean
    Vehicle vehicle3(){
        var veh = new Vehicle();
        veh.setVehicle("Ferrari");
        return veh;
    }
    @Bean
    String hello(){
        return "Hello World";
    }

    @Bean
    Integer print(){
        return 18;
    }
}
