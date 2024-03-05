package com.org.mobile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Mobile {
		@Value("samsung")
	private String name;
		@Value("2000")
	private long price;
	
	private Sim sim;
	
	
	public Sim getSim() {
		return sim;
	}
	@Autowired
	public void setSim(Sim sim) {
		this.sim = sim;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
	
}
