
//Business logic containing the form validation
package com.ashsoft.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


public class LoginController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String uname=request.getParameter("uname");
		String upwd=request.getParameter("upwd");
		
	   
		String status="";
		if(uname.equalsIgnoreCase("ashish") && upwd.equals("ashish"))
		{
			status="SUCCESS";
		}
		else
		{
			status="FAILURE";
		}
		return new ModelAndView("statuspage","status",status); //logicalname[view],key,value[model]
	}

}
