package com.lab3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SeClient {

	public static void main(String[] args)  throws IOException{

		

		NewStudent ns= new NewStudent("shanawaz","shan@gmail.com","banglore","cjava",45454);
		
		FileOutputStream fos =new FileOutputStream("a.txt");
		
		ObjectOutputStream oos =new ObjectOutputStream(fos);

		oos.writeObject(ns);
		
		System.out.println("Serilization Compleated----------------------");
		
		
		
	}

}
