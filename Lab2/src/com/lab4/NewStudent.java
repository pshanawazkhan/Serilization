package com.lab4;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@Table
@PrimaryKeyJoinColumn(name="id")
public class NewStudent  extends Student implements Serializable{


	private static final long serialVersionUID = 1L;


//    @Id
//    @GeneratedValue(strategy=GenerationType.AUTO)
//    @Column(name="cid")
//    private String cid;
	
	
    @Column	
	private String cname;
	
	@Column
	private double cfees;
	
	public NewStudent(){ System.out.println("NewStudent()------>d.c");}

	public NewStudent(String name, String place, String email, String cname, double cfees) {
		super(name, place, email);
		
		this.cname = cname;
		this.cfees = cfees;
	}

//	public String getCid() {
//		return cid;
//	}
//
//	public void setCid(String cid) {
//		this.cid = cid;
//	}

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

