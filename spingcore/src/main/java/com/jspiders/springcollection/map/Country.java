package com.jspiders.springcollection.map;

import java.util.Map;

public class Country 
{
	 private String name;
	 private Map<String,String> statesandlanguages;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, String> getStatesandlanguages() {
		return statesandlanguages;
	}
	public void setStatesandlanguages(Map<String, String> statesandlanguages) {
		this.statesandlanguages = statesandlanguages;
	}
	@Override
	public String toString() {
		return "Country [name=" + name + ", statesandlanguages=" + statesandlanguages + "]";
	}
	 
	 
	 
}
