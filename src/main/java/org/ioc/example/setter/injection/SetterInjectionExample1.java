package org.ioc.example.setter.injection;

import org.ioc.examples.framework.IIOCExamples;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionExample1 implements IIOCExamples {
    @Override
    public void run() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("setterinjection.xml");
        context.registerShutdownHook();

        System.out.println("\nMachine Details");
        Machine machine = context.getBean("mach1", Machine.class);
        System.out.println(machine.getProcessor());
        System.out.println(machine.getRamInGB());
        System.out.println(machine.getHardDiskSizeInGB());
        System.out.println(machine.getGraphicsCardSizeInGB());
        System.out.println(machine.getPorts());

        System.out.println("\nProgrammer Details");
        Programmer programmer = context.getBean("prog1", Programmer.class);
        System.out.println(programmer.getpName());
        System.out.println(programmer.getPrimaryLanguage());
        System.out.println(programmer.getListOfLanguageKnown());
        System.out.println(programmer.getTools());
        System.out.println(programmer.getProjectAssigned());
        System.out.println(programmer.getLanguageWiseFramework());

        System.out.println("\nProgrammer utilising the machine");
        programmer.writeSoftware();

    }
}
