package controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import models.Person;
import services.PersonService;

@RestController
@RequestMapping("/api/v1/person")
public class PersonController
{
	@Autowired
	private PersonService personService;
	
	@RequestMapping("/insert")
	@PostMapping
	public void insertPerson(@RequestBody Person newPerson)
	{
		System.out.println("In Controller");
		personService.insertPerson(newPerson);
		System.out.println("Out Controller");
	}
	
	@RequestMapping("/searchall")
	@GetMapping	
	@ResponseBody
	public List<Person> viewPersons()
	{
		return personService.viewPersons();		
	}
	
	@RequestMapping("/search/{id}")
	@GetMapping
	@ResponseBody
	public Person selectPersonById(@PathVariable("id") UUID id)
	{
		return personService.selectPersonById(id);
	}
	
	@DeleteMapping("/delete/{id}")	
	public void deletePerson(@PathVariable("id")UUID id)
	{
		personService.deletePerson(id);
	}
	
	@PutMapping("/update/{id}")
	public void updatePerson(@PathVariable("id")UUID id,@RequestBody Person updatedPerson)
	{
		personService.updatePerson(id,updatedPerson);
	}
}
