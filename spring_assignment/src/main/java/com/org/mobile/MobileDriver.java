package com.org.mobile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileDriver {
		public static void main(String[] args) {
			ApplicationContext context =  new ClassPathXmlApplicationContext("config.xml");
			
			Mobile mobile = (Mobile) context.getBean("mobile");
			
			System.out.println("Mobile Name  : "+mobile.getName());
			System.out.println("Price : "+mobile.getPrice());
			System.out.println("Sim Service Provider :"+mobile.getSim().getServiceProvider());
			System.out.println("Number :  "+mobile.getSim().getNumber());
			
		}
}
