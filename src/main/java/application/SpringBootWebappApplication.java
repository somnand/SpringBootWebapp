package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages={"controllers"})
public class SpringBootWebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebappApplication.class, args);
	}

}
