package com.training.annotations;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	
	@Required
	public void setName(String name) {
		System.out.println("setName is called");
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	
	@Required
	public void setAge(int age) {
		System.out.println("setAge is called");
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}
