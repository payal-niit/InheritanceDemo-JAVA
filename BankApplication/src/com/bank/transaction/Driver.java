package com.bank.transaction;

public class Driver {

	public static void main(String[] args) {
		
		Person maleParent=new Person();
		maleParent.setFirstName("Rakesh");
		maleParent.setLastName("Pandit");
		maleParent.setGender("male");
		maleParent.setIrisColour("black");
		maleParent.setAddress("Gurgaon");
		maleParent.setParent(true);
		
		Person femaleParent=new Person();
		femaleParent.setFirstName("Abc");
		femaleParent.setLastName("Pqr");
		femaleParent.setGender("female");
		femaleParent.setIrisColour("blue");
		femaleParent.setAddress("Gurgaon");
		femaleParent.setParent(true);
		
		Person child=new Family().getChild(maleParent, femaleParent);
		System.out.println("First Name of Child = "+child.getFirstName());
		System.out.println("Last Name of Child = "+child.getLastName());
		System.out.println("Iris Colour "+child.getIrisColour());
		System.out.println("Gender = "+child.getGender());
		
		
	}

}
