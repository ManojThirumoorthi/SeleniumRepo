package com.facebook;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.MavenTesting.BaseClass;
import com.utility.ReadExcelData;

public class ExcelData extends BaseClass {
	public static void main(String[] args) throws SQLException, InvalidFormatException, IOException {
		browserLaunch("chrome");
		getUrl("https://www.google.com/");
		String data= ReadExcelData.getParticularCell(2,1);
		System.out.println(data);
		WebElement search= driver.findElement(By.name("q"));
		inputData(driver, search, data);
	}
}
