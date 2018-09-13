package com.iamyasas.springbootdemo.model;

public class Employee {
	private int id;
	private String name;
	private int age;
	private String ceg;
	
	public Employee() {
		super();
	}

	public Employee(int id, String name, int age, String ceg) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.ceg = ceg;
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

	public String getCeg() {
		return ceg;
	}

	public void setCeg(String ceg) {
		this.ceg = ceg;
	}

	
}
