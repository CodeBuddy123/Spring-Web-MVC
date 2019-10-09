package com.ashsoft.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.ashsoft.dao.StudentDao;
import com.ashsoft.dto.Student;

public class StudentController extends MultiActionController {
	
	private StudentDao stdDao;
	
	public void setStdDao(StudentDao stdDao) {
		this.stdDao = stdDao;
	}
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response) throws Exception //request with add URI is handled by this method
	{
		String sid=request.getParameter("sid");
		String sname=request.getParameter("sname");
		String saddr=request.getParameter("saddr");
		
		String status=stdDao.add(sid, sname, saddr);
		ModelAndView mv=null;
		
		if(status.equals("success"))
		{
			mv=new ModelAndView("status","msg","Student Insertion Success.");
		}
		if(status.equals("failure"))
		{
			mv=new ModelAndView("status","msg","Student Insertion Failure.");
		}
		if(status.equals("existed"))
		{
			mv=new ModelAndView("status","msg","Student Already Existed.");
		}
		return mv;
	}
	
	
	public ModelAndView search(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		String sid=request.getParameter("sid");
		
		Student std=stdDao.search(sid);
		ModelAndView mv=null;
		if(std==null)
		{
			mv=new ModelAndView("status","msg","Student Not Existed.");
		}
		
		else
		{
			mv= new ModelAndView("studentDetails","std",std);
		}
		
		return mv;
	}
	
	public ModelAndView editform(HttpServletRequest request,HttpServletResponse response) throws Exception
	{
		String sid=request.getParameter("sid");
		
		Student std=stdDao.search(sid);
		
		ModelAndView mv=null;
		if(std==null)
		{
			mv= new ModelAndView("status","msg","Student Not Existed.");
			
		}
		else
		{
			mv=new ModelAndView("editform","std",std);  //forwards the request to updateform.jsp with Student Model Object
		}
		
		return mv;
	}
	
	public ModelAndView update(HttpServletRequest request,HttpServletResponse response) throws Exception
	{
		String sid=request.getParameter("sid");
		String sname=request.getParameter("sname");
		String saddr=request.getParameter("saddr");
		
		String status=stdDao.update(sid, sname, saddr);
		
		ModelAndView mv=null;
		
		if(status.equals("success"))
		{
			mv=new ModelAndView("status","msg","Student Updation Success.");
			
		}
		if(status.equals("failure"))
		{
			mv=new ModelAndView("status","msg","Student Updation Failure.");
		}
		return mv;
	}
	
	
	public ModelAndView delete(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		String sid=request.getParameter("sid");
		
		String status=stdDao.delete(sid);
		
		ModelAndView mv=null;
		
		if(status.equals("success"))
		{
			mv=new ModelAndView("status","msg","Student Deletion Success.");
		}
		else if(status.equals("failure"))
		{
			mv=new ModelAndView("status","msg","Student Deletion Failure.");
		}
		else
		{
			mv=new ModelAndView("status","msg","Student Not Existed.");
		}
		return mv;
	}
}
