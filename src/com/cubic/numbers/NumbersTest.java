package com.cubic.numbers;
import static org.junit.Assert.*;

import org.junit.Test;


public class NumbersTest {
	Numbers n = new Numbers();

	@Test
	public void IsPrimeTest() {
		
		assertEquals(n.IsPrime(7), true);
	}
	
	@Test 
	public void IsEvenTest() {
		
		assertEquals(n.IsEven(4),true);
	}
	
	@Test 
	public void IsOddTest() {
		
		assertTrue(n.IsOdd(5));
	    assertEquals(true,n.IsOdd(5) );
	}
	
	@Test 
	public void AddTest() {
		
		assertEquals(n.Add(4, 5),9);
	}

}
