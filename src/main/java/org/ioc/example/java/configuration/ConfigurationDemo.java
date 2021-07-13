package org.ioc.example.java.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationDemo {

    @Bean("key")
    public Key getKey(){
        Key key = new Key();
        return key;
    }

    @Bean("vehicle")
    public Vehicle getVehicle(){
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleName("i 20");
        vehicle.setKey(getKey());
        return vehicle;
    }
}
