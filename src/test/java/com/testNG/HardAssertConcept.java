package com.testNG;

import org.testng.annotations.Test;

import junit.framework.Assert;


public class HardAssertConcept {
	@Test
	private void hardAssert() {
		String act = "manoj";
		String exp = "Manoj";
		Assert.assertEquals(exp, act);
		System.out.println("Validation");
		
	}
			
}
