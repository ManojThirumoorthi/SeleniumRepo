package com.POM_Manager;

import com.AdactinHotel.BookHotelPagePOM;
import com.AdactinHotel.LogOutPOM;
import com.AdactinHotel.LoginPagePOM;
import com.AdactinHotel.SearchHotelPagePOM;
import com.AdactinHotel.SelectHotelPagePOM;
import com.MavenTesting.BaseClass;
import com.helper.ConfigReader;

public class PageObjectManager extends BaseClass {
	
	private LoginPagePOM login;
	
	public LoginPagePOM getLoginPage() {
		if(login==null) {
			login = new LoginPagePOM(driver);
		}
		return login;
	}
	
	private SearchHotelPagePOM searchHotel;
	
	public SearchHotelPagePOM getSearch() {
		if(searchHotel==null) {
			searchHotel = new SearchHotelPagePOM(driver);
		}
		return searchHotel;
	}
	
	private ConfigReader reader;
	
	public ConfigReader getReader() {
		if(reader==null) {
			reader = new ConfigReader();
		}
		return reader;
	}
	
	private SelectHotelPagePOM select;
	
	public SelectHotelPagePOM getSelect() {
		if(select==null) {
			select = new SelectHotelPagePOM(driver);
		}
		return select;
	}
	
	private BookHotelPagePOM book;
	
	public BookHotelPagePOM getBook() {
		if(book==null) {
			book = new BookHotelPagePOM(driver);
		}
		return book;
	}
	
	private LogOutPOM logOut;
	
	public LogOutPOM getLogOut() {
		if(logOut==null) {
			logOut = new LogOutPOM(driver);
		}
		return logOut;
	}
}
