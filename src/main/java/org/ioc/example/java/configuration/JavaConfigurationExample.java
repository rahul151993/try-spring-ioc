package org.ioc.example.java.configuration;

import org.ioc.examples.framework.IIOCExamples;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class JavaConfigurationExample implements IIOCExamples {
    @Override
    public void run() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationDemo.class);
        context.registerShutdownHook();

        Vehicle vehicle = context.getBean("vehicle", Vehicle.class);
        System.out.println(vehicle);
    }
}
