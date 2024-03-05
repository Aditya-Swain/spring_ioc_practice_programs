package com.org.pack1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Person {
	
	@Autowired
	@Qualifier("chocobar")
	private IceCream ice;

	public IceCream getIce() {
		return ice;
	}

	public void setIce(IceCream ice) {
		this.ice = ice;
	}
	
	
}
