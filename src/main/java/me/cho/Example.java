package me.cho;

import me.cho.conf.ChoProperties;
import me.cho.conf.InJarProperties;
import me.cho.conf.YmlPojo;
import me.cho.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.env.Environment;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@SpringBootApplication

@EnableConfigurationProperties(ChoProperties.class)
@ImportResource("classpath:beanconfig.xml")
public class Example {
	@Autowired
	UserService userService;

	@Autowired
	ApplicationArguments applicationArguments;

	@Value("${name}")
	String name;

	@Value("${ymlcho.name}")
	String ymlname;

	/*@Value("${ymlPojoList}")
	List<YmlPojo> ymlPojoLsit;
	*/

	@Autowired
	ChoProperties choProperties;

	@Autowired
	Environment environment;
	public static void main(String[] args) {
		SpringApplication.run(Example.class, args);

	}

	@Bean
	@ConfigurationProperties("cho")
	@Validated
	public InJarProperties inJarProperties(){
		return new InJarProperties();
	}


	@RequestMapping("/")
	String home(){
		List<String> arguments= applicationArguments.getOptionValues("args");

		String argumentsStr = "";
		if(arguments!=null && !arguments.isEmpty()){
			argumentsStr = arguments.stream().collect(Collectors.joining(","));
		}
		choProperties.getYmlPojolist();
		System.out.println(environment.getProperty("ymlcho.name"));
		System.out.println(environment.getProperty("ymlcho.ymlPojolist[0].name"));

		System.out.println(inJarProperties().getGoingTo());
		System.out.println(inJarProperties().getWorkFor());
		System.out.println(inJarProperties().getLiveIn());

		System.out.println(inJarProperties().getTime1());
		System.out.println(inJarProperties().getTime2());


		return "Hello World reload (spring-boot-devtools)"+ymlname+name+argumentsStr;

	}
}
