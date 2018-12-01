package me.cho;

import me.cho.conf.BeanConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
//@Import(BeanConfig.class)
@ImportResource("beanconfig.xml")
public class Example {
    @RequestMapping("/")
    String home(){
        return "Hello World reload (spring-boot-devtools)";
    }
    public static  void main(String[] args){
        //SpringApplication.run(Example.class,args);
        SpringApplication springApplication = new SpringApplication(Example.class);
        springApplication.addListeners(new AppStartListener());
        springApplication.run(args);
    }
}
