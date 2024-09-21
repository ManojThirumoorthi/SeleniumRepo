package com.AdactinHotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.InterfaceData.SearchHotelPageElements;
import com.MavenTesting.BaseClass;
import com.helper.ConfigReader;

public class SearchHotelPagePOM extends BaseClass implements SearchHotelPageElements {
	static WebDriver driver;
		
	public SearchHotelPagePOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id=location_id)
	private WebElement location;
	
	@FindBy(id=hotels_id)
	private WebElement hotels;
	
	@FindBy(xpath=roomType_Xpath)
	private WebElement roomType;
	
	@FindBy(xpath=noOfRooms_Xpath)
	private WebElement noOfRooms;
	
	@FindBy(xpath=adultsPerRoom_Xpath)
	private WebElement adultsPerRoom;
	
	@FindBy(xpath=childPerRoom_Xpath)
	private WebElement childPerRoom;
	
	@FindBy(id=search_id)
	private WebElement search;
	
	public void getSearchElements() {
		ConfigReader cr=new ConfigReader();
		dropdown(driver,location,"index",cr.getLocation());
		dropdown(driver,hotels,"text",cr.getHotels());
		dropdown(driver,roomType,"value",cr.getRoomType());
		dropdown(driver,noOfRooms,"text",cr.getNoOfRooms());
		dropdown(driver,adultsPerRoom,"value",cr.getAdultsPerRoom());
		dropdown(driver,childPerRoom,"index",cr.getChildPerRoom());
		clickElement(driver,search);
	}
}
