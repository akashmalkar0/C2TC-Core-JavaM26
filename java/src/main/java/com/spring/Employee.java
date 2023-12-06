package com.spring;

public class Employee {
	private String name;
	private String city;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	void display() {
		System.out.println(this.id + " " + this.name + " " + this.city);
	}
}
