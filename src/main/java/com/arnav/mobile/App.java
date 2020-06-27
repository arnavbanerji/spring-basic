package com.arnav.mobile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//injecting dependency using Spring Core annotation (introduced in spring 2.5)
public class App {

    public static void main(String[] args) {
        //Samsung s7 = new Samsung(); traditional way to call object of class
        //s7.config();

        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        Samsung s7 = factory.getBean(Samsung.class);
        s7.config();
    }

}
