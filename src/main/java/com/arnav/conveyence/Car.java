package com.arnav.conveyence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //with @Component, we dont have to call this class in spring.xml file - com.arnav.conveyence.Car
public class Car implements Vehicle {

    @Autowired(required = false) //This annotation allows Spring to resolve and inject collaborating beans into "car" bean.
    //wiring of beans with other beans, in other words Spring by itself figure out dependencies of spring bean
    //we can optionally declare autowired as false if tyre bean is not exposed as @Component so Spring not able to resolve.
    private Tyre tyre;

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public void drive() {
        System.out.println("Car is running.. "+tyre);
    }

}
