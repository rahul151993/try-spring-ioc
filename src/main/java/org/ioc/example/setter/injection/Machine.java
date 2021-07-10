package org.ioc.example.setter.injection;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

public class Machine {

    private int ramInGB;
    private String processor;
    private int hardDiskSizeInGB;
    private int graphicsCardSizeInGB;
    private List<String> ports;

    public List<String> getPorts() {
        return ports;
    }

    public void setPorts(List<String> ports) {
        this.ports = ports;
    }

    public int getRamInGB() {
        return ramInGB;
    }

    public void setRamInGB(int ramInGB) {
        this.ramInGB = ramInGB;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getHardDiskSizeInGB() {
        return hardDiskSizeInGB;
    }

    public void setHardDiskSizeInGB(int hardDiskSizeInGB) {
        this.hardDiskSizeInGB = hardDiskSizeInGB;
    }

    public int getGraphicsCardSizeInGB() {
        return graphicsCardSizeInGB;
    }

    public void setGraphicsCardSizeInGB(int graphicsCardSizeInGB) {
        this.graphicsCardSizeInGB = graphicsCardSizeInGB;
    }

    public void executeCode(){
        System.out.println("Code execution is completed");
    }

    @Override
    public String toString() {
        return "Machine{" +
                "ramInGB=" + ramInGB +
                ", processor='" + processor + '\'' +
                ", hardDiskSizeInGB=" + hardDiskSizeInGB +
                ", graphicsCardSizeInGB=" + graphicsCardSizeInGB +
                '}';
    }

    @PostConstruct
    public void hello(){
        System.out.println("From Lifecycle: Machine Started Successfully");
    }

    @PreDestroy
    public void bye(){
        System.out.println("From Lifecycle: Machine Shut Downed Successfully");
    }
}
