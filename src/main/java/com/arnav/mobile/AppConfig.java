package com.arnav.mobile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //similar to spring.xml, this class will get create bean of component.
@ComponentScan(basePackages = "com.arnav.mobile")
public class AppConfig {

/*    Equivalent XML file for this:
    <beans>
        <bean id="phone" class="Samsung"/>
        <bean id="processor" class="Snapdragon"/>
    </beans>*/
//    @Bean //tell spring that this is the bean
//    public Samsung getPhone() { //getPhone() name doesnt matter
//        return new Samsung();
//    }
//
//    @Bean
//    public  MobileProcessor getProcessor() {
//        return new Snapdragon();
//    }

}
