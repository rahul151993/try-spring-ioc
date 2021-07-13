package org.ioc.example.stereotype.annotation;

import org.ioc.examples.framework.IIOCExamples;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereoTypeAnnotationExample1 implements IIOCExamples {
    @Override
    public void run() {
        ApplicationContext context = new ClassPathXmlApplicationContext("stereotypannotationexample1.xml");
        Airplane airPlane1 = context.getBean("airplane", Airplane.class);
        System.out.println(airPlane1.hashCode());

        Airplane airPlane2 = context.getBean("airplane", Airplane.class);
        System.out.println(airPlane2.hashCode());
    }
}
