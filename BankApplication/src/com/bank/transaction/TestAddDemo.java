package com.bank.transaction;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddDemo {
	@Test
	public void addTest() {
		TestingDemo testingDemo = new TestingDemo();
		assertEquals("Executed Successfully", 4, testingDemo.add(2, 2));
		
		
	}
	
	@Test
	public void addTest2() {
		TestingDemo testingDemo = new TestingDemo();
						
		assertNotEquals(5, testingDemo.add(2, 2));
	}

}
