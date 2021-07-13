package org.ioc.example.java.configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Vehicle {

    private String vehicleName;

    private Key key;

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    @PostConstruct
    public void plugKey(){
        System.out.println("Plug the key!!");
        this.key.startEngine();
    }

    @PreDestroy
    public void removeKey(){
        this.key.stopEngine();
        System.out.println("Remove the plugged key!!");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleName='" + vehicleName + '\'' +
                '}';
    }
}
