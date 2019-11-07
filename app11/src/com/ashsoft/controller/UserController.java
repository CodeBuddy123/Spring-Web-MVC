package com.ashsoft.controller;



import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ashsoft.command.User;

@Controller
@RequestMapping("/reg")
public class UserController {
  
    @RequestMapping(method=RequestMethod.GET)  //showForm is executed for GET Request type
	public String showForm(Model model)
	{
		model.addAttribute("user",new User());
		return "registrationform";
	}
    
    @RequestMapping(method=RequestMethod.POST)//registration form is executed for POST request type
    public ModelAndView registration(@Valid User user,BindingResult errors,Model model)
    {
    	if(errors.hasErrors()) //if any errors exists in form submission
    	{
    		return new ModelAndView("registrationform","user",user);//forwarding request back to registration form
    	}
    	else
    	{
    		return new ModelAndView("registrationdetails","user",user);//forwarding request to registrationdetails page with user model object
    	}
    }
}
