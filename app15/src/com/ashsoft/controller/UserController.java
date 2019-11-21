package com.ashsoft.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserController {
	
	
	@RequestMapping("/helloform")
	public ModelAndView showForm()
	{
		return new ModelAndView("helloform");
	}
	
	@RequestMapping("/wish")
	public ModelAndView wish(HttpServletRequest request, HttpServletResponse response)
	{
		String uname=request.getParameter("uname");
		
		return new ModelAndView("wish","uname",uname);
	}
}
