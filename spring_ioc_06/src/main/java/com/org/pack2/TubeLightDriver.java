package com.org.pack2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.org.MyConfig;

public class TubeLightDriver {
		public static void main(String[] args) {
		ApplicationContext context =	new AnnotationConfigApplicationContext(MyConfig.class);
		
		TubeLight tubeLight = (TubeLight) context.getBean("tubeLight");
		System.out.println(tubeLight);
		}
}
