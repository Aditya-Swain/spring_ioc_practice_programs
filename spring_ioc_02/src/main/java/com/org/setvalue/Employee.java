package com.org.setvalue;

import java.util.*;

public class Employee {
		private int id;
		private String name;
		private int age;
		private long mobile;
		
		private List<Integer> num;
		private Set<String> address;
		private Map<String,Integer> map;
		
		
		
		
		public List<Integer> getNum() {
			return num;
		}
		public void setNum(List<Integer> num) {
			this.num = num;
		}
		public Set<String> getAddress() {
			return address;
		}
		public void setAddress(Set<String> address) {
			this.address = address;
		}
		public Map<String, Integer> getMap() {
			return map;
		}
		public void setMap(Map<String, Integer> map) {
			this.map = map;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public long getMobile() {
			return mobile;
		}
		public void setMobile(long mobile) {
			this.mobile = mobile;
		}
		
		
		
}
