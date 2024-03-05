package com.org;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.org.pack2.TubeLight;

@Configuration
@ComponentScan("com.org")
public class MyConfig {
	@Bean("tubeLight")
			public TubeLight getTubeLight() {
				return new TubeLight();
			}
}
