package com.org;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Marker {
	{
		System.out.println("Marker Object Created");
	}
}
