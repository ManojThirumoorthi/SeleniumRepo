package com.facebook;

import java.sql.SQLException;
import org.openqa.selenium.By;
import com.MavenTesting.BaseClass;
import com.utility.SQLConnector;

public class FacebookRunnerClass extends BaseClass{
	
	public static void main(String[] args) throws SQLException {
		browserLaunch("chrome");
		getUrl("https://www.facebook.com/");
		String data= SQLConnector.getData();
		driver.findElement(By.id("email")).sendKeys(data);
	}
}
