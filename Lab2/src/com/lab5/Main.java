package com.lab5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws Exception{


		Student s =new Student();
		
		s.setId(420);
		s.setName("shanawaz khan");
		s.setEmail("shan@gmail.com");
		s.setPlace("galiveedu");
		
		
		FileOutputStream fos =new FileOutputStream("aa.txt");
		ObjectOutputStream oos =new ObjectOutputStream(fos);
		
		oos.writeObject(s);
		
		System.out.println("Se completed");
		
		
		System.out.println("de serilization");
		
		FileInputStream fis = new FileInputStream("aa.txt");
		ObjectInputStream ois =new ObjectInputStream(fis);
		
	Student stu= (Student)	ois.readObject();
		
                          
		
		System.out.println(stu.getEmail()+"   "+stu.getName()+"   "+stu.getId()+"   ");
		System.out.println("password   "+stu.getPassword());
	}

}
