package com.spring_rest_Q9;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {
	
	
	private long id;
	private String name;
	private String dept;
	private String desig;
	private long salary;
	public Customer() {
		
	}
	public Customer(long id, String name, String dept, String desig, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.desig = desig;
		this.salary = salary;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
}
