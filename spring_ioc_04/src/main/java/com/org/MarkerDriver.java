package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MarkerDriver {
			public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("annotation_config.xml");
			Marker marker = (Marker) context.getBean("marker");
			Marker marker1 = (Marker) context.getBean("marker");
			
			System.out.println(marker==marker1);
			}
}
