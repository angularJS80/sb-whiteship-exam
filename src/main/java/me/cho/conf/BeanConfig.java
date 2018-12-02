package me.cho.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public JavaConfBean javaConfBean(){
        return new JavaConfBean();
    }


}
