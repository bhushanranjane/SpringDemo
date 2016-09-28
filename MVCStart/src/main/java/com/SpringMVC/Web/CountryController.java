/*
  file name:CountryController.java
  Created by:Bhushan Ranjane
  Create Date:-27-09-2016
  Purpose:Handles the Data access to web server
*/
package com.SpringMVC.Web;

import java.util.Collection;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.SpringMVC.Country;
import com.SpringMVC.Service.MockService;
import com.SpringMVC.Service.Service;

@Controller
public class CountryController 
{
	private Service service=new MockService();
	
	@RequestMapping(value="/countryList",method=RequestMethod.GET)
	@ModelAttribute("countries")
	public Collection<Country> getCountries(){
		System.out.println("Countries");
		return service.getAllCountries();
	}
	
	@RequestMapping("/countryDetails")
	public Country getCountry(@RequestParam(value="id", required=true) int countryId) {
		System.out.println("call");
		return service.getCountryById(countryId);
}
}
