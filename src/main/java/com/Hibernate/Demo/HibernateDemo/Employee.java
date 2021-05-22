package com.Hibernate.Demo.HibernateDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@Column(name="EMP_ID")
	private int eid;
	
	@Column(name="Emp_Name")
	private Ename ename;
	
	@Column(name="Emp_Salary")
	private double esalary;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}


	public Ename getEname() {
		return ename;
	}

	public void setEname(Ename ename) {
		this.ename = ename;
	}

	public double getEsalary() {
		return esalary;
	}

	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
	
	

	
	

	
		
	
	
}
