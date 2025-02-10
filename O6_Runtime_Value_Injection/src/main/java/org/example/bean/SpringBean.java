package org.example.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements InitializingBean {

    @Value("Paboda Sanduni")
    private String name;

    public SpringBean() {
        System.out.println("Spring Bean Constructor");
        System.out.println(name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(name);
    }

    /*@Autowired(required = false)
    public SpringBean(@Value("Paboda Sanduni") String name,@Value("10") int id,@Value("Hi") String msg){
        System.out.println("Spring Bean Constructor");
        System.out.println(name);
        System.out.println(id);
        System.out.println(msg);
    }

    @Autowired(required = false)
    public SpringBean(@Value("Paboda Sanduni") String name,@Value("10") int id,@Value("true") boolean okay){
        System.out.println("Spring Bean Constructor");
        System.out.println(name);
        System.out.println(id);
        System.out.println(okay);
    }*/

}
