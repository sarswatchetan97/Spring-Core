package org.example.config;

import org.example.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = {"desktop1", "com1"})
    public Desktop desktop() {
        return new Desktop();
    }
}
