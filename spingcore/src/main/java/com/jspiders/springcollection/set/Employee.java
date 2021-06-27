package com.jspiders.springcollection.set;

import java.util.Set;

public class Employee 
{
	private int empno;
	private String name;
	private double sal;
	private Set<Long> contact;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public Set<Long> getContact() {
		return contact;
	}
	public void setContact(Set<Long> contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", sal=" + sal + ", contact=" + contact + "]";
	}
	
	
}
