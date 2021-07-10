package org.ioc.example.auto.wire;

import org.ioc.examples.framework.IIOCExamples;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireRunner implements IIOCExamples {
    @Override
    public void run() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("autowire.xml");
        context.registerShutdownHook();

        Phone p1 = context.getBean("phone1", Phone.class);
        System.out.println(p1);
    }
}
