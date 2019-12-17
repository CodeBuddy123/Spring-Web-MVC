package com.ashsoft.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DownloadController {
  
	@RequestMapping("/downloadform")
	public String getDownloadForm()
	{
		return "downloadform";
	}
	
	@RequestMapping("/download")
	public void download(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		response.setContentType("APPLICATION/OCTET-STREAM");   //setting the response as Image
		File file= new File("H:\\Images\\Image1.jpg");         //creating a file object with image location
		FileInputStream fis= new FileInputStream(file);        //transferring data into FileInputStream
		
		String fileName=file.getName();                        //Getting exact file name
		response.setHeader("Content-disposition","attachement;filename=\""+fileName+"\""); //Attaching filename to response header
		
		OutputStream os= response.getOutputStream(); //creating OutputStream object
		
		int val=fis.read();
		while(val!=-1)  
		{
			os.write(val);    //reading bit by bit and writing to output stream until EOF!=-1
			val=fis.read();
		}
		fis.close();   //closing the resources
		os.close();
	}
}
