package com.testNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.MavenTesting.BaseClass;

public class CrossBrowserTesting extends BaseClass {
	@Test(expectedExceptions = ArithmeticException.class)
	private void edge() {
		browserLaunch("edge");
		getUrl("https://www.google.co.in/");
		System.out.println("Browser ID: "+ Thread.currentThread().threadId());
		int i =9;
		System.out.println(i/0);
		browserTerminate();
	}
	@Test
	private void chrome() {
		browserLaunch("chrome");
		getUrl("https://www.google.co.in/");
		System.out.println("Browser ID: "+ Thread.currentThread().threadId());
		browserTerminate();
	}
	@Test
	private void firefox() {
		System.out.println("Test");
		browserLaunch("firefox");
		getUrl("https://www.google.co.in/");
		System.out.println("Browser ID: "+ Thread.currentThread().threadId());
		browserTerminate();
	}
}
