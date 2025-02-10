package org.example;

import org.example.DI.Boy;
import org.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitialize {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();


        /*Boy boy = context.getBean(Boy.class);
        boy.chatWithGirl();*/

        Boy bean = (Boy) context.getBean("boy");
        bean.chatWithGirl();

        context.registerShutdownHook();
    }
}
