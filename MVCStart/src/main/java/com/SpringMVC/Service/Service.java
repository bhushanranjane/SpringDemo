/*
  file name:Service.java
  Created by:Bhushan Ranjane
  Create Date:-27-09-2016
  Purpose:Creates the Interface betweeen Country and MockServices
*/
package com.SpringMVC.Service;

import java.util.Collection;

import com.SpringMVC.Country;

public interface Service 
{
	//Create the collection of countries
	public Collection<Country> getAllCountries();
	
	//Get the country details by Country Id
	public Country getCountryById(int countryId);
	 
	//Get the country details by Country Name
	public Country getCountryByName(String countryName);
	 
	//Function to save Country
	public void saveCountry(Country country);
	 
	//Function to remove Country
	public void deleteCountry(Country country);
	 
}
