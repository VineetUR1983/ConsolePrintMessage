package com.vineet.ConsolePrint;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void testAdd_01() {
		
		MathUtils mutils = new MathUtils();
		int result = mutils.add(3, 5);
		System.out.println(result);
		assertEquals(8, result);
		//System.out.println("Test Additon of 3, 5 => 8 " + result);
		//fail("Not yet Implemented");
		
	}

}
