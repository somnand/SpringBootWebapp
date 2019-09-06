package data;

import java.util.List;
import java.util.UUID;

import models.Person;

public interface PersonDAO
{	
	int insertPerson(UUID id,Person person);
	List<Person> viewPersons();
	
	default int insertPerson(Person person)
	{
		System.out.println("Default method!");
		UUID id = UUID.randomUUID();
		return insertPerson(id, person);
	}	
}
