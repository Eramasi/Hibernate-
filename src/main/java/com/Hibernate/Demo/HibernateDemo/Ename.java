package com.Hibernate.Demo.HibernateDemo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Ename {
	
	@Column(name="Emp_Surname")
	private String Surname;
	
	@Column(name="Emp_Fname")
    private String fname;
    
	@Column(name="Emp_Lname")
    private String lname;

	public String getSurname() {
		return Surname;
	}

	public void setSurname(String surname) {
		Surname = surname;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "Ename [Surname=" + Surname + ", fname=" + fname + ", lname=" + lname + "]";
	}
    
    
    

}
