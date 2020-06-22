package com.arnav.conveyence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        /*Vehicle obj = new Car();
        obj.drive();
        Bike obj = new Bike();
        obj.drive();
        Suppose I need to create an object which is independant of Car and Bike, then I can use depedency injection
        Using dependency injection, I would make use of ApplicationContext to get the bean (Car/Bike)
        I dont need to change the source code (com.arnav.conveyence), I only need to change spring.xml
        */

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Vehicle obj = (Vehicle) context.getBean("vehicle"); //"vehicle" is bean id to be called in spring.xml
        obj.drive();
        //in order to get bean using ApplicationContext, you need to initialize BeanFactory
        //For this we will configure the class (Car/Bike) in an xml file (spring.xml - any file name doesnt matter).
    }

}
