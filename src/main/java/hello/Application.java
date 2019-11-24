package hello;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

// is a convenience annotation that adds all of the following:
//@configuration:Tags the class as a source of bean definitions for the application context
//@EnableautoConfiguration:tells spring boot to start adding beans based on classpath settings,other beans,and various property settings
//@ComponentScan:Tells spring to look for other components,configurations and services in the hello package,letting it find the controllers
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	//CommandLineRunner method marked as a Bean and this runs on start up.it retrieves all the beans that were created either by your app 
	//or were automatically added thanks to Spring Boot.It sorts them and prints them out
	@Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }
}
