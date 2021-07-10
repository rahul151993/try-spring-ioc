package org.ioc.example.constructor.injection;

import org.ioc.examples.framework.IIOCExamples;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionExample1 implements IIOCExamples {
    @Override
    public void run() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("constructorinjection.xml");
        context.registerShutdownHook();

        Engine engine = context.getBean("engine1", Engine.class);
        System.out.println("\nEngine Details");
        System.out.println(engine.getEngineType());
        System.out.println(engine.getManufacturingDate());
        System.out.println(engine.getWarrentyInYears());

        Car car = context.getBean("car1", Car.class);
        System.out.println("\nCar Details");
        System.out.println(car.getCarName());
        System.out.println(car.getCarPrice());
        System.out.println(car.getFunctionality());

        car.runCar();

    }
}
