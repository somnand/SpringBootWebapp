package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import services.EntityService;

@RequestMapping("/simple")
public class SimpleController 
{
	@RequestMapping("/hello")
	@ResponseBody
	public String hello()
	{
		return "hello";
	}
	
	@Autowired
	private EntityService service;
	
	@RequestMapping("/find/{id}")
	@GetMapping
	@ResponseBody
	public String searchEntity(@PathVariable("id") String id)
	{
		boolean isPresent=service.selectPersonById(Integer.valueOf(id));
		if(isPresent)
			return "Entity is present";
		else
			return "No Entity found";
	}
}
