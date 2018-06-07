package com.bank.transaction;

public class StringReverseDemo {
	public static void main(String[] args) {
		
		StringBuffer stringBuffer = new StringBuffer("hello");
		String s= stringBuffer.reverse().toString();
		
		System.out.println(s);
		
	}
}
