package com.lab3;

public class NewStudent extends Student {

	private String cid;
	
	private String cname;
	
	private double cfees;
	
	
	NewStudent(){System.out.println("NewStudent()--->d.c"); }

	

	public NewStudent(String name, String email, String place,String cname, double cfees) {
		super(name,email,place);
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
