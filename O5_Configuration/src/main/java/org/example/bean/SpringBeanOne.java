package org.example.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanOne {
    public SpringBeanOne() {
        System.out.println("Spring Bean one Constructor");
    }
}
