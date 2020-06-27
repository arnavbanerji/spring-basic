package com.arnav.mobile;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("mySnapdragon") //custom naming of bean - "mySnapdragon", default bean naming is "snapdragon" (small first letter)
//@Primary //Appconfig will consider Snapdragon bean instead of MediaTek during component scanning
public class Snapdragon implements MobileProcessor {

    public void process() {
        System.out.println("world's best CPU");
    }
}
