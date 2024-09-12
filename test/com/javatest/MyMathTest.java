package com.javatest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class MyMathTest {
	
	private MyMath math = new MyMath();

	@Test
	void test() {
		assertEquals(10, math.calculateTotal(new int[] {1,2,3,4}));
	}
	
	@Test
	void testWith0Element() {
		assertEquals(0, math.calculateTotal(new int[] {}));
	}

}
