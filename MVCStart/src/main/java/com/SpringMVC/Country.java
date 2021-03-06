/*
  file name:Country.java
  Created by:Bhushan Ranjane
  Create Date:-27-09-2016
  Purpose:PoJO class for Country 
*/
package com.SpringMVC;

import java.util.Date;

public class Country 
{
	private Integer id;
	private String name;
	private Integer area;
	private Long population;
	private Date populationLastUpdated;
	private String currency;
	
	public Country () {}
	 
	public Country (Integer id,
	String name,
	Integer area,
	Long population,
	Date populationLastUpdated,
	String currency) {
	setId(id);
	setName(name);
	setArea(area);
	setPopulation(population);
	setPopulationLastUpdated(populationLastUpdated);
	setCurrency(currency);
	}
	
	//Use getter and setter to get and set the values
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getArea() {
		return area;
	}
	public void setArea(Integer area) {
		this.area = area;
	}
	public Long getPopulation() {
		return population;
	}
	public void setPopulation(Long population) {
		this.population = population;
	}
	public Date getPopulationLastUpdated() {
		return populationLastUpdated;
	}
	public void setPopulationLastUpdated(Date populationLastUpdated) {
		this.populationLastUpdated = populationLastUpdated;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public boolean isNew(){
		if(getName().equals(name))
			return true;
		else 
			return false;
	}
	
}
