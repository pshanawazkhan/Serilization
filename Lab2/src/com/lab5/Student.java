package com.lab5;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;
	
	private String name;
	
	private String email;
	
	private String place;
	
 transient	private String password="Shanawaz";

 
 
 public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public Student()  { System.out.println("Student()--->d.c"); }
 
 // Customized Serilization
 
 private void writeObject(ObjectOutputStream oos) throws Exception{
	 
	 oos.defaultWriteObject();
	 
	String pwd =password+"SSS";
	 
	 oos.writeObject(pwd);
 }
 
 private void readObject(ObjectInputStream ois)throws Exception{
	 
	 
ois.defaultReadObject();
	


System.out.println("-----------------------------------------");
	String pwd =(String) ois.readObject();
	password =pwd;
	// System.out.println("private void readObject()---> "+password);
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
