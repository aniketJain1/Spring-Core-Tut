package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
//		Student student = context.getBean("firststudent",Student.class);
		
//		Student student = context.getBean("getStudent",Student.class);
		Student student = context.getBean("student",Student.class);
//		Student student = context.getBean("temp",Student.class);
//		Student student = context.getBean("con",Student.class);
		
		System.out.println(student);
		
		student.study();
		
		
	}
}