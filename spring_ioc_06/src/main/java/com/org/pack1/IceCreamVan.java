package com.org.pack1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.org.MyConfig;

public class IceCreamVan {
			public static void main(String[] args) {
			ApplicationContext context =	new AnnotationConfigApplicationContext(MyConfig.class);
			
			Person person = context.getBean(Person.class);
			Person1 person1 = context.getBean(Person1.class);
			
			System.out.println(person.getIce());
			System.out.println(person1.getIce());
			}
}
