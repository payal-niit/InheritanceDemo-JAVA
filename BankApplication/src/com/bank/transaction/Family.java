package com.bank.transaction;

public class Family {

	public Person getChild(Person father,Person mother)
	{
		Person child=new Person();
		child.setGender("male");
		if(father.isParent()==true && mother.isParent()==true)
		{
			if(father.getIrisColour().equals("blue")&& mother.getIrisColour().equals("blue"))
			{
				child.setIrisColour(father.getIrisColour());
			}
			else if(father.getIrisColour().equals("black")&& mother.getIrisColour().equals("black"))
			{
				child.setIrisColour(father.getIrisColour());
			}
			else if(father.getIrisColour().equals("blue")&& mother.getIrisColour().equals("black"))
			{
				if(child.getGender().equals("male")) {
					
				child.setIrisColour(mother.getIrisColour());
				}
				else {
				child.setIrisColour(father.getIrisColour());
				}
			}
			else if(father.getIrisColour().equals("black")&& mother.getIrisColour().equals("blue"))
			{
				if(child.getGender().equals("male")) {
					
					child.setIrisColour(mother.getIrisColour());
				}
				else {
				child.setIrisColour(father.getIrisColour());
				}
			}
			if(child.getGender().equals("male"))
			{
				child.setFirstName("pankaj");
			
			child.setLastName(father.getLastName());
			
			child.setAddress(father.getAddress());
			
			child.setGender("male");
			
			}
			else
			{
				child.setFirstName("aradhana");
				child.setLastName(father.getLastName());
				child.setAddress(father.getAddress());
				child.setGender("female");
			}
		}
		return child;

	}
}
