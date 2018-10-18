package com.lab3;

import java.io.Serializable;

public class Student implements Serializable {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private int id;
	
	
	private String name;
	
	private String email;
	
	private String place;
	
	
	public Student(){
		
		System.out.println("Student()-->d.c");
		
	}
	
	

	public Student(String name, String email, String place) {
	
		System.out.println("Student(String name, String email, String place)=================");
		this.name = name;
		this.email = email;
		this.place = place;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
	
	
	
	
	
	
	
	
	
	
	
}
