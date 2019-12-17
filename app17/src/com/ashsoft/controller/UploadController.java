package com.ashsoft.controller;

import java.io.FileOutputStream;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import org.springframework.web.servlet.ModelAndView;

@Controller
public class UploadController {
 
	@RequestMapping(value ="/upload", method =RequestMethod.GET)
	public String showUploadForm()
	{
		return "uploadform";
	}
	
	@RequestMapping(value ="/upload", method =RequestMethod.POST)
	public ModelAndView uploadFile(@RequestParam MultipartFile file)
	{
		String status="";
		try {
			String fileName=file.getOriginalFilename();
			byte[] file_Content=fileName.getBytes();
			
			FileOutputStream fos=new FileOutputStream("H:/uploads/"+fileName);
		
			fos.write(file_Content);
			status="Success";
		} catch (Exception e) {
			status="Failure";
			e.printStackTrace();
		}
		return new ModelAndView("status","status",status);
	}
	
}
