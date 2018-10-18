package com.lab3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DesClient {

	public static void main(String[] args) throws Exception {


		FileInputStream fis = new FileInputStream("a.txt");
		
	ObjectInputStream ois = new ObjectInputStream(fis);
	
	        Student stu=  (Student)      ois.readObject();
		
		System.out.println(stu.getEmail()+"  "+stu.getPlace() );
		
		

	}

}
