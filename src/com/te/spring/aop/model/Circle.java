package com.te.spring.aop.model;

import com.te.spring.aop.aspects.Loggable;

public class Circle {

	private String name;

	@Loggable
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Circle Setter to be Called: ");
		throw new RuntimeException();
	}
	
	public String setNameAndReturn(String name) {
		this.name = name;
		System.out.println("Circle Setter to be Called: ");
		return name;
	}
	 
}
