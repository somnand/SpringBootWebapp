package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
