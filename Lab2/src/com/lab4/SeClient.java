package com.lab4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SeClient {

	public static void main(String[] args)  throws IOException{

		//String name, String place, String email, String cname, double cfees

		NewStudent ns= new NewStudent("shanawaz","banglore","shan@gmail.com","cjava",45454);
		
		FileOutputStream fos =new FileOutputStream("a.txt");
		
		ObjectOutputStream oos =new ObjectOutputStream(fos);

		oos.writeObject(ns);
		
		System.out.println("Serilization Compleated----------------------");
		
		oos.close();
		
	}

}
