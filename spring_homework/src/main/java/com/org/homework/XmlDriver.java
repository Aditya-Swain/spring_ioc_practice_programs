package com.org.homework;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class XmlDriver {
		
	public static void main(String[] args) {
		ClassPathResource cpr = new ClassPathResource("aditya.xml");
		XmlBeanFactory factory = new XmlBeanFactory(cpr);
		
		System.out.println(factory.getBean("person"));
		System.out.println(factory.getBean("emp"));
		System.out.println(factory.getBean("remote"));
		System.out.println(factory.getBean("tv"));
	}
}
