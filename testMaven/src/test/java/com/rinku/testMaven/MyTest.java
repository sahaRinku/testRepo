package com.rinku.testMaven;

import org.junit.Assert;
import org.junit.Test;

public class MyTest {

	@Test
	public void method1() {
		Assert.assertTrue(false);
	}
	
	@Test
	public void method2() {
		
	}
	
	@Test
	public void method3() {
		Assert.assertFalse(true);
	}
	
	@Test
	public void method4() {
		Assert.fail("method4 failed");
	}
	
}
