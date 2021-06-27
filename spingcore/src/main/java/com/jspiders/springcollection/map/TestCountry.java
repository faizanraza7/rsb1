package com.jspiders.springcollection.map;

import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCountry {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("com/jspiders/springcollection/map/springconfig.xml");
		
		Country country =(Country) context.getBean("Country");
		System.out.println(country);
		
		Map<String, String> statesandlanguages = country.getStatesandlanguages();
		System.out.println(statesandlanguages.getClass());
		System.out.println(statesandlanguages);

		if(context!=null)
		{
			context.close();
		}
	}

}
