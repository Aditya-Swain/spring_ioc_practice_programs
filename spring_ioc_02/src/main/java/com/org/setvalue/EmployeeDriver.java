package com.org.setvalue;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDriver {
		public static void main(String[] args) {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
			
			Employee employee = (Employee)context.getBean("emp");
			
			System.out.println(employee.getId());
			System.out.println(employee.getName());
			System.out.println(employee.getAge());
			System.out.println(employee.getMobile());
			System.out.println(employee.getNum());
			System.out.println(employee.getAddress());
			System.out.println(employee.getMap());
		}
}
