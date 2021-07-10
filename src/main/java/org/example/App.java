package org.example;

import org.ioc.example.annotation.auto.wire.AnnotationAutoWire;
import org.ioc.example.auto.wire.AutoWireRunner;
import org.ioc.example.constructor.injection.ConstructorInjectionExample1;
import org.ioc.example.setter.injection.SetterInjectionExample1;
import org.ioc.example.stand.alone.collections.StandAloneCollection;
import org.ioc.examples.framework.IIOCExamples;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    // Possible qualifires or implementation classes for IIOCExample interface
    //    @Qualifier("setterex1")
    //    @Qualifier("constructex1")
    //    @Qualifier("autowireex1")
    //    @Qualifier("standex1")

    @Autowired
    @Qualifier("annoex1")
    private IIOCExamples example;

    public IIOCExamples getExample() {
        return example;
    }

    public void setExample(IIOCExamples example) {
        this.example = example;
    }

    public static void main(String[] args )
    {

        //Setter Injection Example
//        IIOCExamples example1 = new SetterInjectionExample1();
//        example1.run();

        //Constructor Injection Examples
//        IIOCExamples example2 = new ConstructorInjectionExample1();
//        example2.run();

        //Auto wire with xml file
//        IIOCExamples example3 = new AutoWireRunner();
//        example3.run();

        //Auto wire with annotation
//        IIOCExamples example4 = new AnnotationAutoWire();
//        example4.run();

        //Stand Alone Collection Example
//        IIOCExamples example5 = new StandAloneCollection();
//        example5.run();

        //Applied annotation for IIOCExample interface also
        ApplicationContext context = new ClassPathXmlApplicationContext("exampleconfig.xml");
        App app1 = context.getBean("app1", App.class);
        app1.getExample().run();
    }
}
