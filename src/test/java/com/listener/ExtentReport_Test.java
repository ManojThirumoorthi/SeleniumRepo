package com.listener;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.MavenTesting.BaseClass;
import com.aventstack.extentreports.ExtentTest;

public class ExtentReport_Test {
	public static ExtentTest extenttest;
	
	@BeforeSuite
	public void extentReportStartUp() {
		BaseClass base=new BaseClass();
		base.extentReportStart(null);
	}
	@AfterSuite
	public void extentReportEnd() throws IOException {
		BaseClass base=new BaseClass();
		base.extentReportTearDown(null);
	}
}
