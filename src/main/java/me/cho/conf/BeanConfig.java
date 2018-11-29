package me.cho.conf;

import javafx.beans.property.adapter.JavaBeanBooleanProperty;
import me.cho.user.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public JavaConfBean javaConfBean(){
        return new JavaConfBean();
    }
}
