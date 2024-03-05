package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Creator {
		public static void main(String[] args) {
			ApplicationContext context  =new ClassPathXmlApplicationContext("config.xml");
			
			Object object = context.getBean("human");
			
			if(object instanceof Human) {
				Human human =(Human)object;
				System.out.println(human);
			}
			else if(object instanceof Heart) {
				Heart heart =(Heart)object;
				System.out.println(heart);
			}
		}
}
