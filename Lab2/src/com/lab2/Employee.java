package com.lab2;


import java.io.Serializable;

public class Employee  implements Serializable{

	private static final long serialVersionUID = 1L;

	
	private int id;
	
	private String name;
	
	private String enamil;
	
	private String place;
	
	
//	public Object writeReplace() throws ObjectStreamException{
//		
//		System.out.println("Object writeReplace()______________");
//		return new ObjectStreamException(){};
//	}
//	
//	public Object readResolve()throws ObjectStreamException{
//		
//		System.out.println("public Object readResolve()------------");
//		
//		return new ObjectStreamException(){};
//	}
	
	public Employee(){System.out.println("Employee--->d.c()"); }

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

	public String getEnamil() {
		return enamil;
	}

	public void setEnamil(String enamil) {
		this.enamil = enamil;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}


	
	
	
	
	
	
	
	
	
	
	
}
