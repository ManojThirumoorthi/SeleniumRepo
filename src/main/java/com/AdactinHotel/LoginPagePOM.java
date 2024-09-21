package com.AdactinHotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.InterfaceData.LoginPageElements;
import com.MavenTesting.BaseClass;
import com.helper.ConfigReader;

public class LoginPagePOM extends BaseClass implements LoginPageElements {
	
	static WebDriver driver;
	
	public LoginPagePOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id=username_id)
	private WebElement username;
	
	@FindBy(name=password_name)
	private WebElement password;
	
	@FindBy(xpath=loginbtn_xpath)
	private WebElement loginBtn;
	
	public void getLoginPageElements() {
		ConfigReader cr=new ConfigReader();
		inputData(driver,username,cr.getUsername());
		inputData(driver,password,cr.getPassword());
		clickElement(driver,loginBtn);
	}

	
}
