package com.AdactinHotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.InterfaceData.BookHotelPageElements;
import com.MavenTesting.BaseClass;
import com.helper.ConfigReader;

public class BookHotelPagePOM extends BaseClass implements BookHotelPageElements {
	static WebDriver driver;
	
	public BookHotelPagePOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath=firstName_Xpath)
	private WebElement firstName;
	
	@FindBy(xpath=lastName_Xpath)
	private WebElement lastName;
	
	@FindBy(id=address_id)
	private WebElement address;
	
	@FindBy(id=creditCardNo_id)
	private WebElement creditCardNo;
	
	@FindBy(id=creditCardType_id)
	private WebElement creditCardType;
	
	@FindBy(xpath=expiryMonth_id)
	private WebElement expiryMonth;
	
	@FindBy(xpath=expiryYear_id)
	private WebElement expiryYear;
	
	@FindBy(id=cvv_id)
	private WebElement cvv;
	
	@FindBy(xpath=book_Xpath)
	private WebElement book;
	
	@FindBy(id=cancel_id)
	private WebElement cancel;
	
	public void getBookHotelElements() {
		ConfigReader cr=new ConfigReader();
		inputData(driver, firstName,cr.getFirstName());
		inputData(driver, lastName, cr.getLastName());
		inputData(driver, address, cr.getAddress());
		inputData(driver, creditCardNo, cr.getCreditCardNo());
		dropdown(driver, creditCardType,"index",cr.getCreditCardType());
		dropdown(driver, expiryMonth, "value",cr.getExpiryMonth());
		dropdown(driver, expiryYear, "text",cr.getExpiryYear());
		inputData(driver, cvv, cr.getCvv());
		clickElement(driver, book);
	}
}
