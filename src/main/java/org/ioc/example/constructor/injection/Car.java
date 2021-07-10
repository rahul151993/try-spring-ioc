package org.ioc.example.constructor.injection;

import java.util.List;

public class Car {
    private String carName;
    private Double carPrice;
    private List<String> functionality;

    private Engine engine;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(Double carPrice) {
        this.carPrice = carPrice;
    }

    public List<String> getFunctionality() {
        return functionality;
    }

    public void setFunctionality(List<String> functionality) {
        this.functionality = functionality;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void runCar(){
        this.engine.runEngine();
    }

    public Car(String carName, Double carPrice, List<String> functionality, Engine engine) {
        this.carName = carName;
        this.carPrice = carPrice;
        this.functionality = functionality;
        this.engine = engine;
    }
}
