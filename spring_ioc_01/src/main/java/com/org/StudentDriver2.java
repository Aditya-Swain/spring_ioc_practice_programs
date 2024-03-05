package com.org;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDriver2 {
		public static void main(String[] args) {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("MyConfig.xml");
			
			Student student = (Student)context.getBean("s1");
		}
}
