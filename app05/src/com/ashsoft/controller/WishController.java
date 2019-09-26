package com.ashsoft.controller;

import java.time.LocalTime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WishController extends AbstractController {

	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		LocalTime time=LocalTime.now();
		int hour=time.getHour();
		String message="";
		if(hour<12)
		{
			message="Good Morning!";
		}
		else if(hour<17)
		{
			message="Good Afternoon!";
		}
		else if(hour<21)
		{
			message="Good Evening!";
		}
		else
		{
			message="Good Night!";
		}
		
		return new ModelAndView("wish", "message",message);
	}

}
