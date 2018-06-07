package com.bank.transaction;

interface DemoInterface{
	public int isEqual (DemoInterface i);
}

public class Demo implements DemoInterface{
	
	public String print() {
		return getClass().getName();
	}
	
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d.print());
		System.out.println(d.toString());
	}

	@Override
	public int isEqual(DemoInterface i) {
		
		return 0;
	}
	
	

}
