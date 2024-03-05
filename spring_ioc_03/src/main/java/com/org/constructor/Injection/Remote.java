package com.org.constructor.Injection;

public class Remote {
			
	String name;
	
	int price;
	
	Battery battery;

	public Remote(String name, int price, Battery battery) {
		this.name = name;
		this.price = price;
		this.battery = battery;
	}

	public Remote() {
		
	}
	
	
}
