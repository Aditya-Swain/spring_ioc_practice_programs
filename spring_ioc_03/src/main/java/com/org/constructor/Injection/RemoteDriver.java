package com.org.constructor.Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RemoteDriver {
		
	public static void main(String[] args) {
		
		ApplicationContext context =  new ClassPathXmlApplicationContext("config2.xml");
		
		Remote remote = (Remote)context.getBean("remote");
		
		System.out.println(remote.name);
		System.out.println(remote.price);
		System.out.println(remote.battery.name);
		
	}
}
