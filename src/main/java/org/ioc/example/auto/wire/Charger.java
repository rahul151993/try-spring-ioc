package org.ioc.example.auto.wire;

public class Charger {
    private String voltage;

    public String getVoltage() {
        return voltage;
    }

    public void setVoltage(String voltage) {
        this.voltage = voltage;
    }

    @Override
    public String toString() {
        return "Charger{" +
                "voltage='" + voltage + '\'' +
                '}';
    }

    public void switchOnCharger(){
        System.out.println("Charger is switched on");
        System.out.println("Phone is on");
    }

    public void switchOffCharger(){
        System.out.println("Charger is switched off");
        System.out.println("Phone is turned off");
    }
}
