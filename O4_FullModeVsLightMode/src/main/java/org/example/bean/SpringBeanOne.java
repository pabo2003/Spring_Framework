package org.example.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanOne {
    //Light Mode
    @Bean
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
    }
}
