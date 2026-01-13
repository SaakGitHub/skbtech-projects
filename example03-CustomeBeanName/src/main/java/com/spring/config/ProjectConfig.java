package com.spring.config;

import com.spring.bean.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean(name = "toyotaVehicle")
    Vehicle vehicle1(){
        var veh = new Vehicle();
        veh.setName("Toyota Supra");
        return veh;
    }

    @Bean(value = "audiVehicle")
    Vehicle vehicle2(){
        var veh = new Vehicle();
        veh.setName("Audi8");
        return veh;
    }

    @Bean("ferrariVehicle")
    Vehicle vehicle3(){
        var veh = new Vehicle();
        veh.setName("Ferrari");
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
