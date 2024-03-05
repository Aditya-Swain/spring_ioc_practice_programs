package com.org.constructor.Injection;

public class Calculator {
			
		int a;
		int b;
		
		
		
		public Calculator(String a, String b) {
			this.a = Integer.parseInt(a);
			this.b = Integer.parseInt(b);
			System.out.println("calulator string , string ");
		}
		
		public Calculator(int a, int b) {
			this.a = a;
			this.b = b;
			System.out.println("calulator int ,int ");
		}
		
		public Calculator(double a, int b) {
			this.a = (int)a;
			this.b = b;
			System.out.println("calulator double , int ");
		}
		
		public Calculator(double a, double b) {
			this.a = (int)a;
			this.b = (int)b;
			System.out.println("calulator double , double ");
		}
		
		public Calculator() {
			System.out.println("calculator no-arg");
			
		}
		
}
