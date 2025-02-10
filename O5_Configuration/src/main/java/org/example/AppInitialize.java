package org.example;

import org.example.bean.SpringBean;
import org.example.config.AppConfig;
import org.example.config.AppConfig1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitialize {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.register(AppConfig1.class);
        context.refresh();

        /*AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext();
        context1.register(AppConfig1.class);
        context1.refresh();*/

        context.registerShutdownHook();
    }
}
