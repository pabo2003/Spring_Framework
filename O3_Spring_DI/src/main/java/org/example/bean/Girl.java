package org.example.bean;

import org.springframework.stereotype.Component;

@Component
public class Girl implements Aggrement{
    public Girl() {
        System.out.println("Girl Constructor");
    }

    @Override
    public void chat() {
        System.out.println("Chatting....");
    }
}
