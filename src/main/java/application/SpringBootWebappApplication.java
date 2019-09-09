package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import controllers.WelcomeController;
import data.PersonDAO;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages = { "controllers", "data", "services" })
public class SpringBootWebappApplication
{

	public static void main(String[] args)
	{
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootWebappApplication.class, args);
		System.out.println("Bean : " + context.getBean(WelcomeController.class));		
	}

}
