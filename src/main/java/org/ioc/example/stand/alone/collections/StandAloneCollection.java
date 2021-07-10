package org.ioc.example.stand.alone.collections;

import org.ioc.examples.framework.IIOCExamples;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StandAloneCollection implements IIOCExamples {
    @Override
    public void run() {
        ApplicationContext context = new ClassPathXmlApplicationContext("standalonecollections.xml");
        Person p1 = context.getBean("person2", Person.class);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getFriends());
        System.out.println(p1.getFriends().getClass().getName());
        System.out.println(p1.getHobbies());
        System.out.println(p1.getHobbies().getClass().getName());
        System.out.println(p1.getDegreeWithPassingYear());
        System.out.println(p1.getDegreeWithPassingYear().getClass().getName());
    }
}
