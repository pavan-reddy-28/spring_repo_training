package com.training.task;

public class customerType {
  
	private String id;
	private String type;
	@Override
	public String toString() {
		return "customerType [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + ", id=" + id + ", type=" + type + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	public customerType(String id, String type) {
		super();
		this.id = id;
		this.type = type;
	}
	
}
