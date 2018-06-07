package com.bank.transaction;

public class EmployeeMain {
	
	public static void main(String[] args) {
		Employee govind = new Employee(1, "Govind", new Address("D-121", "Mumbai"));
		
		
		Address a1 = new Address("S-21", "Mumbai");
		
		Employee employee = new Employee(12, "Sujata", a1);
	}

}
