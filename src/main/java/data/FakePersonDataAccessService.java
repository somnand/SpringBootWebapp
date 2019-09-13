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
	public boolean insertPerson(UUID id, Person person)
	{
		System.out.println("In DAO");
		person.setId(id);
		persons.add(person);
		return true;
	}
	
	@Override
	public List<Person> viewPersons()
	{
		System.out.println(persons);
		return persons;
	}

	@Override
	public boolean deletePerson(UUID id)
	{
		for(Person p : persons)
		{
			if(p.getId().equals(id))
			{
				persons.remove(p);
				return true;
			}
		}		
		return false;
	}

	@Override
	public boolean updatePerson(UUID id, Person updatedPerson)
	{
		for(Person p : persons)
		{
			if(p.getId().equals(id))
			{
				persons.remove(p);
				updatedPerson.setId(p.getId());
				persons.add(updatedPerson);
				return true;
			}
		}		
		return false;
	}

	@Override
	public Person selectPersonById(UUID id)
	{
		for(Person p : persons)
		{
			if(p.getId().equals(id))
				return p;
		}
		return null;
	}

}
