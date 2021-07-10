package org.ioc.example.constructor.injection;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Date;

public class Engine {
    private String engineType;
    private Date manufacturingDate;
    private int warrentyInYears;

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public int getWarrentyInYears() {
        return warrentyInYears;
    }

    public void setWarrentyInYears(int warrentyInYears) {
        this.warrentyInYears = warrentyInYears;
    }

    public Engine(String engineType, Date manufacturingDate, int warrentyInYears) {
        this.engineType = engineType;
        this.manufacturingDate = manufacturingDate;
        this.warrentyInYears = warrentyInYears;
    }

    @PostConstruct
    public void startEngine(){
        System.out.println("Engine is started");
    }

    public void runEngine(){
        System.out.println("\nCar is running!");
    }

    @PreDestroy
    public void endEngine(){
        System.out.println("Engine is shut downed");
    }
}
