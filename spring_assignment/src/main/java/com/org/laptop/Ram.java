package com.org.laptop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Ram {
	
	
		@Value("DDR4")
	private String type;
		
		
	@Value("SSD")
	private String memory;
	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}
	
	
}
