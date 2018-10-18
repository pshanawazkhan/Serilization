package com.lab4;

public class Student {

	
	private int id;
	
	private String name;
	
	private String place;
	
	private String email;
	{
		place="DFedfcc";
		
		email="Vfvrgvgtr";
		
		name="fdcsedce";
		
		
	}
	public Student(){ 
		
		
		System.out.println("Student()_____>d.c");}
	
	
	

	public Student(String name, String place, String email) {
	
		this.name = name;
		this.place = place;
		this.email = email;
	}




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
	
}
