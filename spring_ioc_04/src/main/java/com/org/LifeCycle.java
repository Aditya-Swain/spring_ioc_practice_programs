package com.org;

import java.nio.file.spi.FileSystemProvider;

public class LifeCycle {
	
	
		public void init() {
			System.out.println("init-method executed");
		}
		
		
		public void destroy() {
				System.out.println("destroy-method executed");
		}
}
