package com.org.constructor.Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalculatorDriver {
		public static void main(String[] args) {
		ApplicationContext context =	new ClassPathXmlApplicationContext("config1.xml");
		
		}
}
 