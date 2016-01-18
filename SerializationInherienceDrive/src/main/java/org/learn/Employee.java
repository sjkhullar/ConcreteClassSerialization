package org.learn;

import java.io.Serializable;

public class Employee extends Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String department;
	public int employCode = 1010;
	public int salary;
	public Employee(String department,int salary, int employCode,
			String firstName,int age, String contact) {
		super(firstName,age, contact);
		this.department = department;
		this.salary = salary;
		this.employCode = employCode;		
	}
	
	public String toString() {
	    return  super.toString() + "[" + department + " " + employCode +
		       " " + salary + "]";
	}
}