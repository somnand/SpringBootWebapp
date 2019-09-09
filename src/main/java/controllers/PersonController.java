package controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import models.Person;
import services.PersonService;

@RestController
public class PersonController
{
	private final PersonService personService;

	@Autowired
	public PersonController(PersonService service)
	{
		super();
		this.personService = service;
	}
	@RequestMapping("/api/v1/person")
	@PostMapping
	public void insertPerson(@RequestBody Person newPerson)
	{
		System.out.println("In Controller");
		personService.insertPerson(newPerson);
		System.out.println("Out Controller");
	}
	
	@RequestMapping("/api/persons")
	@GetMapping	
	@ResponseBody
	public List<Person> viewPersons()
	{
		return personService.viewPersons();		
	}
	
	@RequestMapping("/api/person/{id}")
	@GetMapping
	@ResponseBody
	public Person selectPersonById(@PathVariable("id") UUID id)
	{
		return personService.selectPersonById(id);
	}	
}
