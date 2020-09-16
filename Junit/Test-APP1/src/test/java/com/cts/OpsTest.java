package com.cts;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class OpsTest {
	
	public static int sum(int x,int y){
		return x+y;
	}
	
	
	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals("It must be Hello ...","Hello", "Hello");	
	
	}
	
	@Test
	public void t2() {
		assertEquals(sum(100,200), 300);
	}
	

}
