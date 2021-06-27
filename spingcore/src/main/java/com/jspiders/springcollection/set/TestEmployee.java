package com.jspiders.springcollection.set;


import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestEmployee {

	public static void main(String[] args) 
	{
		
ClassPathXmlApplicationContext context = null;
		
		context = new ClassPathXmlApplicationContext("com/jspiders/springcollection/set/springconfig.xml");
		
		Employee employee = (Employee)context.getBean("Employee");
		System.out.println(employee);
		
		Set<Long> contact = employee.getContact();
		System.out.println(contact.getClass());
		
		if(context != null)
		{
			context.close();
		}
	}

}
