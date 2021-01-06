package com.qa.main;

public class Customer {
	
	String firstName;
	String lastName;//declare & initialise
	int birthDay;
	String birthMonth;
	int birthYear;
	String email;
	
	
	//constructor 
	public Customer(String firstName, String lastName) { 
		this.firstName="Gie";
		this.lastName="Fortuna";
	}
	
	//setter-first name
	public void setFirstName(String newFirstName) {
		this.firstName=newFirstName;
	}
	
	// getter- first name 
	public String getFirstName() {
		return firstName;
	}
	
	//setter-last name
	public void setLastName(String newLastName) {
		this.lastName=newLastName;
	}
	
	// getter- last name 
	public String getLastName() {
		return lastName;
	}
	
	//setter birthday
	public void setBirthDay(int newBirthDay) {
		this.birthDay=newBirthDay;
	}
	
	// getter birthday
	public int getBirthDay() {
		return birthDay;
	}

	//get+set birthmonth
	public String getBirthMonth() {
		return birthMonth;
	}

	public void setBirthMonth(String newBirthMonth) {
		this.birthMonth = newBirthMonth;
	}

	//get+set birth year
	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int newBirthYear) {
		this.birthYear = newBirthYear;
	}

	//get+set email
	public String getEmail() {
		return email;
	}

	public void setEmail(String newEmail) {
		this.email = newEmail;
	}
	
	
	///////// main

}
