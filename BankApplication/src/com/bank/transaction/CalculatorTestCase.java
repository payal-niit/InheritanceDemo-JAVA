package com.bank.transaction;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTestCase {
	
	Calculator calculator;
	
	@Before
	public void setUp() {
		calculator = new Calculator();
	}
	
	@After
	public void tearDown() {
		calculator = null;
	}
	
	@Test
	public void addTest() {		
		assertEquals("The addition output is 4", 4, calculator.add(2, 2));
	}
	
	@Test
	public void subractTest() {
		assertEquals("The addition output is 4", 2, calculator.subract(4, 2));
	}

}
