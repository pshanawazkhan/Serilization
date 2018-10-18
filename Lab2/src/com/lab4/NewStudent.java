package com.lab4;

import java.io.Serializable;

public class NewStudent  extends Student implements Serializable{


	private static final long serialVersionUID = 1L;



	private String cid;
	
	
	
	private String cname;
	
	
	private double cfees;
	
	public NewStudent(){ System.out.println("NewStudent()------>d.c");}

	public NewStudent(String name, String place, String email, String cname, double cfees) {
		super(name, place, email);
		
		this.cname = cname;
		this.cfees = cfees;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public double getCfees() {
		return cfees;
	}

	public void setCfees(double cfees) {
		this.cfees = cfees;
	}

	
	
	
	
	
}

