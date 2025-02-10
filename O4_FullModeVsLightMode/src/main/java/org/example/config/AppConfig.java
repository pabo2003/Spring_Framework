package org.example.config;

import org.example.bean.SpringBeanThree;
import org.example.bean.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.bean")
public class AppConfig {
    //Full Mode
    /*@Bean
    public SpringBeanTwo getSpringBeanTwo(){
        //InterBean Dependency Injection - Bean method ekk athule thawath bean method ekk invoked/calls krnw nam eka InterBean Dependency Injection kiyala kiynwa
        SpringBeanThree springBeanThree1 = getSpringBeanThree();
        SpringBeanThree springBeanThree2 = getSpringBeanThree();
        System.out.println(springBeanThree1);
        System.out.println(springBeanThree2);
        return new SpringBeanTwo();
    }

    @Bean
    public SpringBeanThree getSpringBeanThree(){
        return new SpringBeanThree();
    }*/
}
