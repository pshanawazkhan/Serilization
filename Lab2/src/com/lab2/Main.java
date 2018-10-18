package com.lab2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws Exception{

Employee e = new Employee();
e.setId(1282);
	e.setEnamil("Shanawaz@gm.com");
	e.setName("Shanawaz khan");
	e.setPlace("Galiveedu");
	
	
		FileOutputStream fos = new FileOutputStream("a.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(e);
		System.out.println(e.hashCode());
		System.out.println("Serilization IS cOMPLEATED ");
		
		
	}

}
