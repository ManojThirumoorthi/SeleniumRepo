package com.AdactinHotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.InterfaceData.LogOutElements;
import com.MavenTesting.BaseClass;

public class LogOutPOM extends BaseClass implements LogOutElements {
	static WebDriver driver;
	
	public LogOutPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id=logout_id)
	private WebElement logOut;
	
	public void getLogOutElements() {
		explicitWait(driver, logOut);
		clickElement(driver, logOut);
	}
}
