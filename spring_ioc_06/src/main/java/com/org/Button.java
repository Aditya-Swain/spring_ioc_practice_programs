package com.org;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Button {
		@Value("Black")
		private String color;

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}
		
}
