package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    private int age;

    //@Autowired
    @Qualifier("desktop")
    private Computer com;

    public Alien() {
        System.out.println("Alien Object Created");
    }

//    public Alien(int age, Laptop lap) {
//        this.age = age;
//        this.lap = lap;
//    }

    public void code() {
        System.out.println("Coding...");
        com.compile();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter Called");
        this.age = age;
    }

//    public Laptop getLap() {
//        return lap;
//    }
//
//    public void setLap(Laptop lap) {
//        this.lap = lap;
//    }

    public Computer getCom() {
        return com;
    }

    @Autowired //setter injection
    public void setCom(Computer com) {
        this.com = com;
    }
}
