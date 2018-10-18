package com.lab4;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Student")
@Inheritance(strategy=InheritanceType.JOINED)
public class Student {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column
	private String name;
	@Column
	private String place;
	@Column
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
