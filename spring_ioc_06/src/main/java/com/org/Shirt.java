package com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Shirt {
				@Value("M")
				private String size;
				@Value("99")
				private int price;
				public int getPrice() {
					return price;
				}

				public void setPrice(int price) {
					this.price = price;
				}

				@Value("Blue")
				private String color;
				@Autowired
				private Button button;

				public String getSize() {
					return size;
				}

				public void setSize(String size) {
					this.size = size;
				}

				public String getColor() {
					return color;
				}

				public void setColor(String color) {
					this.color = color;
				}

				public Button getButton() {
					return button;
				}

				public void setButton(Button button) {
					this.button = button;
				}
				
				
}
