package com.vineet.ConsolePrint;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void testAdd_01() {
		
		MathUtils mutils = new MathUtils();
		int result = mutils.add(3, 5);
		// System.out.println(result);
		System.out.println("Test Additon of 3, 5 => Expected > 8 :: Actual > " + result);
		assertEquals(8, result);		
		
	}

	@Test
	void testAdd_02() {
		
		MathUtils mutils = new MathUtils();
		int result = mutils.add(4, 5);
		// System.out.println(result);
		System.out.println("Test Additon of 4, 5 => Expected > 8 :: Actual > " + result);
		assertEquals(8, result);		
		
	}
	
	@Test
	void testAdd_03() {
		
		MathUtils mutils = new MathUtils();
		int result = mutils.add(3, -5);
		// System.out.println(result);
		System.out.println("Test Additon of 3, -5 => Expected > -2 :: Actual > " + result);
		assertEquals(-2, result);		
		
	}
}
