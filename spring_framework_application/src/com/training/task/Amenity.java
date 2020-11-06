package com.training.task;

public class Amenity {
private String data;

public Amenity() {
	super();
	// TODO Auto-generated constructor stub
}

public Amenity(String data) {
	super();
	this.data = data;
}

@Override
public String toString() {
	return "Amenity [data=" + data + "]";
}

public String getData() {
	return data;
}

public void setData(String data) {
	this.data = data;
}

}
