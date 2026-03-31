package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer {
    public Laptop() {
        System.out.println("Laptop object created");
    }

    public void machine() {
        System.out.println("Its a machine");
    }

    @Override
    public void compile() {
        System.out.println("Laptop code compiling...");
    }
}
