package com.lab6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args)throws Exception {


		
		Student stu = new Student("Shanawaz@gm.com");
		
		stu.setId(420);
		stu.setName("Shanawaz khan");
		stu.setEmail("shanawaz@gmail.com");
		stu.setPassword("Welcome");
		
		
		FileOutputStream fos =new FileOutputStream("hi.txt");
		ObjectOutputStream  oos= new ObjectOutputStream(fos);
		
		oos.writeObject(stu);
		
		System.out.println("Se completed-----------------");
		
		FileInputStream fis =new FileInputStream("hi.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		
	 Student stu1 = (Student) ois.readObject();
	 
	 System.out.println(stu1.getName()+"  "+stu1.getPassword()+"  "+stu1.getEmail());
System.out.println("des completed-------------------");
	}

}
