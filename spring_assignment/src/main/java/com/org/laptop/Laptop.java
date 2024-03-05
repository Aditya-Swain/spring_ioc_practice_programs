package com.org.laptop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
		@Value("lenovo")
	private String brand;
		
		@Value("23000")
	private int price;
		
		@Value("black")
	private String color;
	
	private Ram ram;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Ram getRam() {
		return ram;
	}
	
	@Autowired
	public void setRam(Ram ram) {
		this.ram = ram;
	}
	
	
}
