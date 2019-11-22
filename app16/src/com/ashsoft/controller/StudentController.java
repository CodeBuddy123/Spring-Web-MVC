package com.ashsoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ashsoft.command.Student;
import com.ashsoft.exception.MarksOutOfBoundsException;

@Controller
@RequestMapping("/marks")
public class StudentController {

   
	@RequestMapping(name = "/marks", method = RequestMethod.GET)
	public ModelAndView showMarksForm()
	{
		return new ModelAndView("marksform","student", new Student());
	}
	@ExceptionHandler
	@RequestMapping(name = "/marks", method=RequestMethod.POST)
	public ModelAndView showMarksDetails(Student student)
	{
		if(student.getSmarks()<0 || student.getSmarks()>100)
		{
			throw new MarksOutOfBoundsException("Invalid Marks, Please Provide marks in the range 0 to 100.");
		}
		return new ModelAndView("marksdetails","student",student);
	}
}
