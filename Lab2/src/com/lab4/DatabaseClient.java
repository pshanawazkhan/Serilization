package com.lab4;

import org.hibernate.Session;
import org.hibernate.Transaction;



public class DatabaseClient {

	public static void main(String[] args) {

   org.hibernate.SessionFactory sf=  HibernateUtil.getSessionFactory();
     Session s1= sf.openSession();
		
		Transaction tx =s1.beginTransaction();
		
		NewStudent ns =new NewStudent("sd", "dfdf", "dfefe", "headace", 3434355);
		
		s1.save(ns);
		
		tx.commit();
		
		
		

	}

}
