package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import models.Client;

@Controller
public class WelcomeController
{
	@RequestMapping("client")
	@ResponseBody
	public ModelAndView autoConfigure(Client client)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("client", client);
		mv.setViewName("welcome_client");
		return mv;
	}
	
	@RequestMapping("welcome")
	@ResponseBody
	public ModelAndView welcome(@RequestParam("userName") String userName)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("userName", userName);
		mv.setViewName("welcome");
		return mv;
	}
	@RequestMapping("helloWorld")
	@ResponseBody
	public String helloWorld()
	{
		return "Hello World - <br/>from Spring Boot"; 
	}
}
