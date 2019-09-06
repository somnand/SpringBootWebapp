package data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import models.Person;

@Repository
public class FakePersonDataAccessService implements PersonDAO
{
	private static List<Person> persons = new ArrayList<>();

	@Override
	public int insertPerson(UUID id, Person person)
	{
		System.out.println("In DAO");
		person.setId(id);
		persons.add(person);
		return 1;
	}
	
	@Override
	public List<Person> viewPersons()
	{
		System.out.println(persons);
		return persons;
	}

}
