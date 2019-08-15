package com.lab6;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Student  implements Externalizable{

	public Student() {
	System.out.println("public Student()----0->d.c");
	}

	private int id;
	
	private String name;
	
	private String email;
	
	transient private String password="Shanawaz";
	
	

	public Student(String email) {
	
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		System.out.println("public void readExternal()----------");
		name=(String) in.readObject();
		password= (String) in.readObject();
        email="shan";
		System.out.println("--------------------------------");
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {

		out.writeObject(name);
		out.writeObject(password);
		
		
		System.out.println("public void writeExternal(--------------");
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
