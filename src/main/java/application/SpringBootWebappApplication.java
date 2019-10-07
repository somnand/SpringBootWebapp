package application;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import dao.FakePersonDataAccessService;
import models.Person;
import services.PersonService;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages = { "controllers", "dao", "services" })
@EntityScan(basePackages={"models"})
public class SpringBootWebappApplication
{
	private static PersonService personService;
	
	public static void main(String[] args)
	{
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootWebappApplication.class, args);
		//TODO Move this entry into the FakePersonDataAccessService class. 
		//The process main() -> PersonService -> FakePersonDataAccessService which entries into the DB.
		/*personService = context.getBean(PersonService.class);
		String[] initEntries = {"Wonder-Woman","Superman","Batman","Galactus","Silver Surfer"};
		Person person =null;
		for(int i=0;i<5;i++)
		{
			person = new Person(UUID.randomUUID(),initEntries[i]);
			personService.insertPerson(person);
		}
		System.out.println("Init entry done!!");*/
	}

}
