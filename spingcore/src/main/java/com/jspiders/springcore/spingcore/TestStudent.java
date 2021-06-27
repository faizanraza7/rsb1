package com.jspiders.springcore.spingcore;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context = null;
		
		context = new ClassPathXmlApplicationContext("com/jspiders/springcore/spingcore/spingconfig.xml");
		
		Student student = (Student)context.getBean("Student");
		System.out.println(student);
		
		List<String> subjects = student.getSubjects();
		System.out.println(subjects.getClass());
		
		if(context != null)
		{
			context.close();
		}
	}

}
