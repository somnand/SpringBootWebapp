package data;

import java.util.List;
import java.util.UUID;

import models.Person;

public interface PersonDAO
{	
	default boolean insertPerson(Person person)
	{
		System.out.println("Default method!");
		UUID id = UUID.randomUUID();
		return insertPerson(id, person);
	}
	
	boolean insertPerson(UUID id,Person person);
	List<Person> viewPersons();
	boolean deletePerson(UUID id);
	boolean updatePerson(UUID id,Person updatedPerson);
	Person selectPersonById(UUID id);
}
