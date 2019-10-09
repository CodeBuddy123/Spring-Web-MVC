package com.ashsoft.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;


import com.ashsoft.command.user.User;

public class LoginController extends AbstractCommandController {
	
	public  LoginController() {
		
		setCommandClass(User.class);
		setCommandName("user");
	}
	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command, BindException arg3) throws Exception {
	   ModelAndView mv=null;
	   User user=(User)command;
	   
	   String uname=user.getUname();  //getting the data from CommandObject
	   String upwd=user.getUpwd();
	   
	   if(uname.equals("ashish")&& upwd.equals("ashish"))
	   {
		   mv=new ModelAndView("status", "msg","Login Success.");
	   }
	   else
	   {
		   mv=new ModelAndView("status", "msg","Login Failure.");
	   }
		return mv;
	}
}
