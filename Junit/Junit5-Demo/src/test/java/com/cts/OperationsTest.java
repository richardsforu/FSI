package com.cts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OperationsTest {
	static public int sum(int x,int y) {
		return x+y;
	}
	@Test
	void test() {
		assertEquals("Hello", "Hello");
	}
	
	@Test
	void test1() {
		assertEquals(sum(100, 200), 300);
	}
	
	
	
	
	

}
