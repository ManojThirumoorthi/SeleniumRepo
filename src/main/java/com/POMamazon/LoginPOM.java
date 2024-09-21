package com.POMamazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.MavenTesting.BaseClass;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class LoginPOM extends BaseClass {
	public WebDriver driver;
	
	public LoginPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='nav-link-accountList-nav-line-1']")
	private WebElement signInBtn;
	
	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(id="continue")
	private WebElement continueBtn;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(id="signInSubmit")
	private WebElement signInBtn1;
	
	@FindBy(xpath="//div[contains(text(),'Enter a valid email address')]")
	private WebElement emailError;
	
	@FindBy(xpath="//div[contains(text(),'Enter your email')]")
	private WebElement emailEmpty;
	
	@FindBy(xpath="//*[@class='a-list-item']")
	private WebElement passwordError;
	
	@FindBy(xpath="//div[contains(text(),'Enter your')]")
	private WebElement passwordEmpty;
	
	public boolean validLogin(ExtentTest extenttest) {
		try {
			getUrl("https://www.amazon.in/");
			clickElement(driver,signInBtn);
			inputData(driver, email, "t.manojthirumoorthy@gmail.com");
			clickElement(driver, continueBtn);
			inputData(driver, password, "Sachin1@");
			clickElement(driver, signInBtn1);
			String title= driver.getTitle();
			Assert.assertEquals(title,"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
			extenttest.log(Status.PASS, "Login Successful");
		} catch (AssertionError e) {
			extenttest.log(Status.FAIL, "Login Unsuccessful: " + e.getMessage() );
			return false;
		}
		return true;
	}
	
	public void invalidLogin() {
		getUrl("https://www.amazon.in/");
		clickElement(driver,signInBtn);
		inputData(driver, email, "t.manojthirumoorthy@gm");
		clickElement(driver, continueBtn);
		String emailErrors = emailError.getText();
		Assert.assertEquals(emailErrors,"Enter a valid email address or phone number");
	}
	
	public void emailEmptyLogin() {
		getUrl("https://www.amazon.in/");
		clickElement(driver,signInBtn);
		inputData(driver, email, " ");
		clickElement(driver, continueBtn);
		String emlEmpty= emailEmpty.getText();
		Assert.assertEquals(emlEmpty, "Enter your email or mobile phone number");
	}
	
	public void passwordError() {
		getUrl("https://www.amazon.in/");
		clickElement(driver,signInBtn);
		inputData(driver, email, "t.manojthirumoorthy@gmail.com");
		clickElement(driver, continueBtn);
		inputData(driver, password, "Sachin");
		clickElement(driver, signInBtn1);
		String pwdError= passwordError.getText();
		Assert.assertEquals(pwdError, "Your password is incorrect");
	}
	
	public void passwordEmpty() {
		getUrl("https://www.amazon.in/");
		clickElement(driver,signInBtn);
		inputData(driver, email, "t.manojthirumoorthy@gmail.com");
		clickElement(driver, continueBtn);
		inputData(driver, password, " ");
		clickElement(driver, signInBtn1);
		String pwdEmpty= passwordEmpty.getText();
		Assert.assertEquals(pwdEmpty, "Enter your password");
	}
	
}
