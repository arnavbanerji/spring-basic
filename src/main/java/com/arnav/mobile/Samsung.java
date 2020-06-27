package com.arnav.mobile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {

    @Autowired
    @Qualifier("mySnapdragon") //alternative to @Primary, selects snapdragon bean instead of mediatek
    MobileProcessor cpu;

    public MobileProcessor getCpu() {
        return cpu;
    }
    public void setCpu(MobileProcessor cpu) {
        this.cpu = cpu;
    }

    public void config() {
        System.out.println("Octa core, 4gb RAM, 12MP camera");
        cpu.process();
    }

}
