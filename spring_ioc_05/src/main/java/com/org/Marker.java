package com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Marker {
	
//		@Autowired
		private Cap cap;
		@Value("20")
		private int price;
		
//		@Autowired
	public Marker(Cap cap) {
			this.cap = cap;
			System.out.println("constructor injection");
		}


	public int getPrice() {
			return price;
		}


		public void setPrice(int price) {
			this.price = price;
		}


	public Cap getCap() {
			return cap;
		}

		@Autowired
		public void setCap(Cap cap) {
			this.cap = cap;
			System.out.println("setter-method injection");
		}


	{
		System.out.println("marker object created");
	}
	
		
}
