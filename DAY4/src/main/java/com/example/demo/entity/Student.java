package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id

	//@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="AGE")
	private int age;
	
	@Column(name="SALARY")
	private long salary;
	
	public Student() {}

	public Student(int id, String name, int age,long salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary=salary;
		
	}
	public long getId() {
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
	public long getSALARY() {
		return salary;
	}

	public void setSALARY(long salary) {
		this.salary = salary;
	}

	    
	
}