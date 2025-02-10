package org.example.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Girl1 implements Aggrement{
    public Girl1() {
        System.out.println("Girl1 Constructor");
    }

    @Override
    public void chat() {
        System.out.println("Chatting Girl1");
    }
}
