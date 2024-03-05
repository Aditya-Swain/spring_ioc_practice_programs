package com.org;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class StudentDriver {
		
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		ClassPathResource cpr = new ClassPathResource("aditya.xml");
		
		XmlBeanFactory beanFactory =  new XmlBeanFactory(cpr);
		
		Student student = (Student)beanFactory.getBean("s1");
		
		System.out.println(student);
	}
}
