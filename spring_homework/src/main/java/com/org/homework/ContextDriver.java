package com.org.homework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextDriver {
		public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("aditya.xml");
			
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("emp"));
			System.out.println(context.getBean("remote"));
			System.out.println(context.getBean("tv"));
		}
}
