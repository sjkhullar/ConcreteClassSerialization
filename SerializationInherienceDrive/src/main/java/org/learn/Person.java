package org.learn;

public class Person {

	public String firstName;
	public int age;
	public String contact;
	public Person(String firstName,int age, String contact) {
		this.firstName = firstName;
		this.age = age;
		this.contact = contact;
	}
	public Person() {
		
	}
	public String toString() {
	    return "[" + firstName +
		       " " + age + " " +contact +"]";
	}
}