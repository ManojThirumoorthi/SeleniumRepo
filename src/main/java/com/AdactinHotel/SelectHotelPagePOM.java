package com.AdactinHotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.InterfaceData.SelectHotelPageElements;
import com.MavenTesting.BaseClass;

public class SelectHotelPagePOM extends BaseClass implements SelectHotelPageElements {
	static WebDriver driver;
	
	public SelectHotelPagePOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath=radioButton_xpath)
	private WebElement select;
	
	@FindBy(id=continuebtn_id)
	private WebElement continueBtn;
	
	@FindBy(id=cancelbtn_id)
	private WebElement cancelBtn;
	
	public void getSelectPageElements() {
		clickElement(driver, select);
		isSelected(driver,select);
		clickElement(driver,continueBtn);
	}
}
