package com.testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class SoftAssertConcept {
	@Test
	private void softAssert() {
		String act = "Manoj";
		String exp = "Manoj9";
		
		SoftAssert as=new SoftAssert();
		as.assertEquals(act, exp);
		System.out.println("Verification");
	}
}
