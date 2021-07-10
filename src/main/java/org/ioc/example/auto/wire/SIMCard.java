package org.ioc.example.auto.wire;

public class SIMCard {
    private String company;
    private String generation;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    @Override
    public String toString() {
        return "SIMCard{" +
                "company='" + company + '\'' +
                ", generation='" + generation + '\'' +
                '}';
    }

    public void callSomeOne(){
        System.out.println("calling rahul!");
        System.out.println("talking!");
    }

    public void callEnd(){
        System.out.println("call finished!");
    }
}
