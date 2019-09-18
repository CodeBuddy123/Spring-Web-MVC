package com.ashsoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {
	
	@RequestMapping("/loginform")
	public String loginform()
	{
		
		return "loginform"; //view logical name
	}
	
	@RequestMapping(value ="/login" ,method =RequestMethod.POST)
	public String login(@RequestParam("uname") String uname,String upwd,ModelMap map)
	{
		String status="";
		
		if(uname.equals("ashish") && upwd.equals("ashish"))
		{
			status="success";
		}
		else
		{
			status="failure";
		}
		map.addAttribute("status",status); //model object
		return status;
	}
}
