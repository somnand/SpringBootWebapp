package application;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

import dao.OracleDataAccessService;
import models.Person;
import services.PersonService;

@EnableJpaRepositories(basePackages = {"dao"})
@Component
public class DBInitializer implements CommandLineRunner
{	
	@Autowired	
	OracleDataAccessService personRepo;
	
	@Autowired
	PersonService service;
	
	@Override
	public void run(String[] args)
	{
		System.out.println("Invoking the command line runner");
		Person p1 = new Person(UUID.fromString("99df7037-11bb-45cf-b06c-3e962f03ecd9"),"Wonder-Woman");
		Person p2 = new Person(UUID.fromString("a8826430-085d-45a5-9777-ad20559d5751"),"Superman");
		
		//service.save(p1);
		//service.save(p2);
		
		System.out.println("Database initialization finised");
	}
}
