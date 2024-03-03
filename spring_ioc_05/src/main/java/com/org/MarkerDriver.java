package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MarkerDriver {
		public static void main(String[] args) {
			ApplicationContext context =  new ClassPathXmlApplicationContext("myconfig.xml");
			
			Marker marker = (Marker) context.getBean("marker");
			
			System.out.println(marker);
			System.out.println(marker.getCap());
			System.out.println(marker.getPrice());
		}
}
