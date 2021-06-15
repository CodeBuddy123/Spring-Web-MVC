package com.ashsoft.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.ashsoft.service.ILocaleService;

public class CountriesController implements Controller {

	private ILocaleService service;
	
	
	public CountriesController(ILocaleService service) {
		System.out.println("CountriesController.CountriesController()");
		this.service = service;
	}


	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		List<String> listCountries = service.fetchAllCountries();
		
		return new ModelAndView("list_countries","countriesinfo",listCountries);
	}

}
