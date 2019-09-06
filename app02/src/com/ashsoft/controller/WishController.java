package com.ashsoft.controller;

import java.time.LocalTime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class WishController implements Controller {
	
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		LocalTime time=LocalTime.now();
		int hours=time.getHour();
		String message="";
		if(hours<12)
		{
			message="Good Morning!";
		}
		else if(hours<16)
		{
			message="Good Afternoon!";
		}
		else if(hours<21)
		{
			message="Good Evening!";
		}
		else
		{
			message="Good Night!";
		}
		
		return new ModelAndView("wish","message",message);  //logicalname,key,value
	}

}
