package data;

import java.util.List;
import java.util.UUID;

import models.Person;

public interface PersonDAO
{	
	default int insertPerson(Person person)
	{
		System.out.println("Default method!");
		UUID id = UUID.randomUUID();
		return insertPerson(id, person);
	}
	
	int insertPerson(UUID id,Person person);
	List<Person> viewPersons();
	int deletePerson(UUID id);
	int updatePerson(UUID id,Person updatedPerson);
	Person selectPersonById(UUID id);
}
