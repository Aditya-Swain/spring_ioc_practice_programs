package com.org.laptop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopDriver {
		
	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("config.xml");
		
		   Laptop laptop = (Laptop)context.getBean("laptop");
		   
		   System.out.println("Laptop Brand : "+laptop.getBrand());
		   System.out.println("Price : "+laptop.getPrice());
		   System.out.println("Color : "+laptop.getColor());
		   System.out.println("Ram Type : "+laptop.getRam().getType());
		   System.out.println("Memory : "+laptop.getRam().getMemory());
	}
}
