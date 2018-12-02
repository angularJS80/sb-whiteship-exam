package me.cho;

import me.cho.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@SpringBootApplication
@ImportResource("classpath:beanconfig.xml")
public class Example {
	@Autowired
	UserService userService;

	@Autowired
	ApplicationArguments applicationArguments;

	@Value("${name}")
	String name;
	public static void main(String[] args) {
		SpringApplication.run(Example.class, args);

	}

	@RequestMapping("/")
	String home(){
		List<String> arguments= applicationArguments.getOptionValues("args");
		String argumentsStr = arguments.stream().collect(Collectors.joining(","));


		return "Hello World reload (spring-boot-devtools)"+name+argumentsStr;

	}
}
