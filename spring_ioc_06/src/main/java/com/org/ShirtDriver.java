package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ShirtDriver {
			public static void main(String[] args) {
			ApplicationContext context =	new AnnotationConfigApplicationContext(MyConfig.class);
			
			Shirt shirt = (Shirt) context.getBean("shirt");
			
			System.out.println("Size : "+shirt.getSize());
			System.out.println("Price : "+shirt.getPrice());
			System.out.println("Color : "+shirt.getColor());
			System.out.println("Button Color : "+shirt.getButton().getColor());

			}
}
