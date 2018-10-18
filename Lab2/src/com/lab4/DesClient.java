package com.lab4;

import java.io.FileInputStream;

import java.io.ObjectInputStream;


public class DesClient {

	public static void main(String[] args) throws Exception {


		FileInputStream fis = new FileInputStream("a.txt");
		
	ObjectInputStream ois = new ObjectInputStream(fis);
	
	        Student stu=  (Student)      ois.readObject();
		
		System.out.println(stu.getEmail()+"  "+stu.getPlace() );
		
ois.close();		

	}

}
