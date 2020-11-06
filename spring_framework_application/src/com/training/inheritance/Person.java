package com.training.inheritance;

public class Person {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	public Person() {
		// TODO Auto-generated constructor stub
		name="";
	}

}
