package org.example;

import org.example.bean.SpringBeanThree;
import org.example.bean.SpringBeanTwo;
import org.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitialize {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        /*SpringBeanTwo springBeanTwo = context.getBean(SpringBeanTwo.class);
        SpringBeanThree springBeanThree = context.getBean(SpringBeanThree.class);

        System.out.println("SpringBeanTwo: " + springBeanTwo);
        System.out.println("SpringBeanThree: " + springBeanThree);*/



        context.registerShutdownHook();
    }
}
