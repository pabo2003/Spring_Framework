package org.example.DI;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Girl implements Aggrement{
    public Girl() {
        System.out.println("");
    }

    @Override
    public void chat() {
        System.out.println("Chatting...");
    }
}
