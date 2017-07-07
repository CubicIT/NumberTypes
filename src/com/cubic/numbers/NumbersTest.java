package com.cubic.numbers;

import static org.junit.Assert.*;

import org.junit.Test;

// import junit.framework.Assert;

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
	   //  assertAssertArrayEquals();
	}
	
	@Test 
	public void AddTest() {
		
		assertEquals(n.Add(4, 5),9);
	}

}
