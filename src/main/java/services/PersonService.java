package services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import data.PersonDAO;
import models.Person;

@Service
public class PersonService
{
	@Autowired
	private PersonDAO personDAO;		
	
	public boolean insertPerson(Person newPerson)
	{
		System.out.println("In Service");
		if(newPerson.getId()!=null)
			return personDAO.insertPerson(newPerson.getId(),newPerson);
		return personDAO.insertPerson(newPerson);
	}
	
	public List<Person> viewPersons()
	{
		return personDAO.viewPersons();
	}
	
	public Person selectPersonById(UUID id)
	{
		return personDAO.selectPersonById(id);
	}
	
	public boolean deletePerson(UUID id)
	{
		return personDAO.deletePerson(id);
	}
	
	public boolean updatePerson(UUID id, Person updatedPerson)
	{
		return personDAO.updatePerson(id, updatedPerson);
	}
}
