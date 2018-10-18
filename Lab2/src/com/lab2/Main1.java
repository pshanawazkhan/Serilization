package com.lab2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Main1 {

	public static void main(String[] args) throws Exception {


		FileInputStream fis =new FileInputStream("a.txt");
		
		ObjectInputStream ois =new ObjectInputStream(fis);
		
		Employee e= (Employee) ois.readObject();
		
		System.out.println(e.getId()+"  "+e.getName()+"  "+e.getPlace()+"  "+e.hashCode());
		
		ois.close();

	}

}
