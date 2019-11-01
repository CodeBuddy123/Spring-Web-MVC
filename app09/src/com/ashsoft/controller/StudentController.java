package com.ashsoft.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractFormController;

import com.ashsoft.command.Student;

public class StudentController extends AbstractFormController {

	public StudentController() {
		setCommandClass(Student.class);
		setCommandName("student");
		setSessionForm(true);
		
		
	}
	@Override
	protected ModelAndView processFormSubmission(HttpServletRequest request, HttpServletResponse response, Object command, //this method is responsible for processing,after form data gets submitted
			BindException arg3) throws Exception {
		Student student=(Student)command;
	
		return new ModelAndView("registrationDetails", "std", student); //making student object available in registrationDetails page
	}

	@Override
	protected ModelAndView showForm(HttpServletRequest request, HttpServletResponse response, BindException e) //this method is responsible for generating form
			throws Exception {
		
		return new ModelAndView("registrationform");  //shows the form to the user
	}

}
