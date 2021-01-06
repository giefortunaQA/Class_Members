package com.qa.main;

public class Runner {
	
	public static void main(String[] args) {
		Customer customer1= new Customer("Gie", "Fortuna");
		@SuppressWarnings("unused")
		Customer customer2= new Customer("Nikita","Dean");
		@SuppressWarnings("unused")
		Customer customer3= new Customer("Peter", "Vaghaun-Williams");
		@SuppressWarnings("unused")
		Customer customer4= new Customer("Emmy","Kidd");
		@SuppressWarnings("unused")
		Customer customer5= new	Customer("Peprah", "Amoh-Donkor");
		@SuppressWarnings("unused")
		Customer customer6= new Customer("Nicholas","Johnson");
		
		System.out.println(customer1.getFirstName());

	}

}
