package com.org;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleDriver {
		public static void main(String[] args) {
			AbstractApplicationContext context =  new ClassPathXmlApplicationContext("config.xml");
			
			LifeCycle life = (LifeCycle) context.getBean("life");
			
			context.registerShutdownHook();
			
			System.out.println(life);
		}
}
