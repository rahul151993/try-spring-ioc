package org.ioc.example.annotation.auto.wire;

import org.ioc.examples.framework.IIOCExamples;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationAutoWire implements IIOCExamples {
    @Override
    public void run() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("autowirewithannotation.xml");
        context.registerShutdownHook();

        School s1 = context.getBean("sc1", School.class);
        System.out.println(s1);
    }
}
