package com.lab4;

import java.io.ObjectStreamException;

import org.apache.commons.collections.StaticBucketMap;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;




final public class HibernateUtil {

	static  SessionFactory sf= null;
	
	static {
		
		
		AnnotationConfiguration cfg =new AnnotationConfiguration();
		
		cfg= (AnnotationConfiguration) cfg.configure();
		
		sf = cfg.buildSessionFactory();
		
		
	}
	
	private HibernateUtil() {
		
		
		
		
	}
	
	final public static SessionFactory getSessionFactory() {
		
		
		
		return sf;
	}
	
	public Object writeReplace()throws ObjectStreamException{
		
		
		
		return new Exception();
	}
	public Object readResolve()throws ObjectStreamException{
		
		
		
		return  new Exception();
	}
	
	public Object clone()throws CloneNotSupportedException{
		
		
		return new CloneNotSupportedException();
	}
	
	
	
}
