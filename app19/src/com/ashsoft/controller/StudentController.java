package com.ashsoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ashsoft.command.Student;
import com.ashsoft.service.StudentService;

@Controller
public class StudentController {
	
    @Autowired
	private StudentService studentService;
    
	@RequestMapping(value= "/welcome", method = RequestMethod.GET)
	public String showWelcomePage()
	{
		return "welcomeDef";   //returning definitions instead of JSP
	}
	//==============ADD MODULE========
	@RequestMapping( value="/add", method= RequestMethod.GET)
	public ModelAndView showAddform()
	{
		return new ModelAndView("addDef","student",new Student());
	}
	@RequestMapping( value="/add", method= RequestMethod.POST)
	public ModelAndView add(Student student)
	{
		String status="";
		status=studentService.addStudent(student);
		return new ModelAndView("statusDef","status",status);
	}
	
	//==============SEARCH MODULE========
	@RequestMapping( value="/search", method= RequestMethod.GET)
	public ModelAndView showSearchform()
	{
		return new ModelAndView("searchDef","student",new Student());
	}
	@RequestMapping( value="/search", method= RequestMethod.POST)
	public ModelAndView search(Student student)
	{
		ModelAndView modelAndView=null;
		Student std= studentService.searchStudent(student.getSid());
		if(std==null)
		{
			modelAndView=new ModelAndView("statusDef","status","Student not Existed");
		}
		else
		{
			modelAndView=new ModelAndView("studentDetailsDef","student",std);
		}
		return modelAndView;
	}
	//==============DELETE MODULE========
	@RequestMapping( value="/delete", method= RequestMethod.GET)
	public ModelAndView showDeleteform()
	{
		return new ModelAndView("deleteDef","student",new Student());
	}
	@RequestMapping( value="/delete", method= RequestMethod.POST)
	public ModelAndView delete(Student student)
	{
		String status="";
		status=studentService.deleteStudent(student.getSid());
		return new ModelAndView("statusDef","status",status);
	}
}
