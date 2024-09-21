package com.runner;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.MavenTesting.BaseClass;
import com.POMamazon.LoginPOM;
import com.listener.ExtentReport_Test;
import com.listener.ITestListenerClass;

@Listeners(ITestListenerClass.class)

public class AmazonRunner extends BaseClass {
	public static WebDriver driver;
	
	@BeforeTest
	public static void setup() {
		driver=BaseClass.browserLaunch("chrome");
	}
	
	@Test(priority=-2)
	public static void validLoginTest() {
		ExtentReport_Test.extenttest=extentReports.createTest("Login Test" + " : " + Thread.
				currentThread().getStackTrace()[1].getMethodName().toString()).info("Valid Email and Valid Password");
		
		LoginPOM lp=new LoginPOM(driver);
		Assert.assertTrue(lp.validLogin(ExtentReport_Test.extenttest));
	}
	
	@Test(priority=-3)
	public void invalidLoginTest() {
		ExtentReport_Test.extenttest=extentReports.createTest("Login Test" + " : " + Thread.
				currentThread().getStackTrace()[1].getMethodName().toString()).info("Invalid Email");
		
		LoginPOM lp=new LoginPOM(driver);
		lp.invalidLogin();
	}
	
	@AfterTest
	public static void terminate() {
		browserTerminate();
	}
	
	@BeforeSuite
	private void extentStartUp() {
		extentReportStart("C:\\Users\\tmsma\\eclipse-workspace\\MavenTesting\\Reports");
	}
	
	@AfterSuite
	private void extentReportEnd() throws IOException {
		extentReportTearDown("C:\\Users\\tmsma\\eclipse-workspace\\MavenTesting\\Reports\\index.html");
	}
	
}
