package org.ioc.example.auto.wire;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Phone {
    private String phoneName;

    private Charger charger;

    private SIMCard sim;

    public Charger getCharger() {
        return charger;
    }

    public void setCharger(Charger charger) {
        this.charger = charger;
        System.out.println("Inside Setter of charger");
    }

    public SIMCard getSim() {
        return sim;
    }

    public void setSim(SIMCard sim) {
        this.sim = sim;
        System.out.println("Inside Setter of sim");
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public Phone(Charger charger, SIMCard sim) {
        this.charger = charger;
        this.sim = sim;
        System.out.println("Inside constructor to inject charger and sim dependencies");
    }

    public Phone() {
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneName='" + phoneName + '\'' +
                ", charger=" + charger +
                ", sim=" + sim +
                '}';
    }

    @PostConstruct
    public void phoneStarted(){
        this.charger.switchOnCharger();
        this.sim.callSomeOne();
    }

    @PreDestroy
    public void phoneTurnedOff(){
        this.sim.callEnd();
        this.charger.switchOffCharger();
    }
}
