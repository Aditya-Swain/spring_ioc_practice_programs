package com.rog.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ShopDriver {
		public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Shop1 shop1 = context.getBean(Shop1.class);
		Shop2 shop2 = context.getBean(Shop2.class);
		
		System.out.println(shop1);
		System.out.println(shop1.getDealer());
		System.out.println(shop2);
		System.out.println(shop2.getDealer());
		}
}
