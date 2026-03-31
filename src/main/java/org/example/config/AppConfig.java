package org.example.config;

import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

//    @Bean
//    public Alien alien(Computer com) { //@Qualifier("desktop")
//        Alien alien = new Alien();
//        alien.setAge(25);
//        alien.setCom(com);
//        return alien;
//    }
//
////    @Bean(name = {"desktop1", "com1"})
//    @Bean
////    @Scope("prototype")
//    public Desktop desktop() {
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop() {
//        return new Laptop();
//    }
}
