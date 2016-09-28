/*
  file name:MockService.java
  Created by:Bhushan Ranjane
  Create Date:-27-09-2016
  Purpose:Contains the Country data
*/
package com.SpringMVC.Service;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.SpringMVC.*;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class MockService implements Service {
	private static Map<Integer, Country> countries = new HashMap<Integer, Country>();
	private static int nextCountryId = 200;

	static {
		try {
			countries.put(14, new Country(14, "Germany", 137847, 82046000L, parseDate("30-nov-2008"), "Euro"));
			countries.put(48, new Country(48, "Ghana", 92098, 23837000L, null, "Cedi"));
			countries.put(53,
					new Country(53, "Australia", 2966200, 21884000L, parseDate("04-sep-2009"), "Australian Dollar"));
			countries.put(73, new Country(73, "Greece", 50949, 11257285L, parseDate("1-jan-2009"), "Euro"));
			countries.put(122, new Country(122, "Georgia", 26900, 4382100L, parseDate("1-jan-2009"), "Lari"));
			countries.put(123,
					new Country(123, "New Zealand", 104454, 4320300L, parseDate("4-sep-2009"), "New Zealand Dollar"));
			countries.put(147, new Country(147, "Gambia", 4361, 1705000L, null, "Dalasi"));
			countries.put(149, new Country(149, "Gabon", 103347, 1475000L, null, "CFA franc"));
		} catch (java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Parse date to String
	private static Date parseDate(String textDate) throws java.text.ParseException {
		try {
			return new SimpleDateFormat("dd-MMM-yyyy").parse(textDate);
		} catch (ParseException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	// function to display all countries
	public Collection<Country> getAllCountries() {
		return countries.values();

	}

	// Function to get country by Id
	public Country getCountryById(int countryId) {
		// Returns a new object and not just a reference
		// to an object in the collection.
		System.out.println("country id:" + countryId);
		Country country = countries.get(countryId);
		try {
			System.out.println(country.getName());
		} catch (Exception e) {
			System.out.println("error");
		}
		return new Country(country.getId(), country.getName(), country.getArea(), country.getPopulation(),
				country.getPopulationLastUpdated(), country.getCurrency());
	}

	// Function to get country by Name
	public Country getCountryByName(String countryName) {
		for (Country country : countries.values()) {
			if (country.getName().toLowerCase().equals(countryName.toLowerCase())) {
				return country;
			}
		}
		return null;
	}

	// If the country is new Save the Country in List
	public void saveCountry(Country country) {
		if (country.isNew()) {
			nextCountryId++;
			country.setId(nextCountryId);
			countries.put(nextCountryId, country);
		} else {
			countries.put(country.getId(), country);
		}
	}

	// If the country already exit delete
	public void deleteCountry(Country country) {
		countries.remove(country.getId());
	}

}
