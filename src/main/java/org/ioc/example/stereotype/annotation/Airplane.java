package org.ioc.example.stereotype.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope("prototype")// to define the scope of the bean
public class Airplane {

    @Value("AirIndia")
    private String company;

    @Value("250")
    private int noOfSeats;

    @Value("#{flights}")
    private List<String> flightSchedules;

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public List<String> getFlightSchedules() {
        return flightSchedules;
    }

    public void setFlightSchedules(List<String> flightSchedules) {
        this.flightSchedules = flightSchedules;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "company='" + company + '\'' +
                ", noOfSeats=" + noOfSeats +
                ", flightSchedules=" + flightSchedules +
                '}';
    }
}
