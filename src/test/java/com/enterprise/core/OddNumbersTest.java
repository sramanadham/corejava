package com.enterprise.core;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OddNumbersTest {
	OddNumbers oddNumbers;
	@Before
	public void setUp() {
		oddNumbers = new OddNumbers();
	}

	@Test
	public void testSumOfOddNumbers() {
		assertEquals(25,oddNumbers.findSum(new int[]{1,2,3,4,5,6,7,8,9}));
	}
	
	@Test
	public void testSumOfOddNumbers_onlyOddNumbers() {
		assertEquals(27,oddNumbers.findSum(new int[]{1,5,5,7,9}));
	}
	
	@Test
	public void testSumOfOddNumbers_onlyEvenNumbers() {
		assertEquals(0,oddNumbers.findSum(new int[]{4,6,2,2,8,0}));
	}
	
	@Test
	public void testSumOfOddNumbers_empty() {
		assertEquals(0,oddNumbers.findSum(new int[]{}));
	}
	
	@Test
	public void testAverage() {
		assertEquals(5.0,oddNumbers.findAverage(new int[]{1,2,3,4,5,6,7,8,9}),0.001);
	}
	
	@Test
	public void testAverage_onlyOdd() {
		assertEquals(5.0,oddNumbers.findAverage(new int[]{1,3,5,7,9}),0.001);
	}
}
