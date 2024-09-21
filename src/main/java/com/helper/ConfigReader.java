package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	FileInputStream fis;
	Properties pro;
	
	private Properties getConfigFileValues() {
		File file = new File("C:\\Users\\tmsma\\eclipse-workspace\\MavenTesting\\src\\main\\java\\com\\ConfigProperties\\config.properties");
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		pro = new Properties();
		try {
			pro.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return pro;
	}
	
	public String getBrowserName() {
		String browserName= getConfigFileValues().getProperty("browser");
		return browserName;
	}
	
	public String getUrl() {
		String url= getConfigFileValues().getProperty("url");
		return url;
	}
	
	public String getUsername() {
		String username= getConfigFileValues().getProperty("username");
		return username;
	}
	
	public String getPassword() {
		String password= getConfigFileValues().getProperty("password");
		return password;
	}
	
	public String getLocation() {
		String location= getConfigFileValues().getProperty("location");
		return location;
	}
	
	public String getHotels() {
		String hotels= getConfigFileValues().getProperty("hotels");
		return hotels;
	}
	
	public String getRoomType() {
		String roomType= getConfigFileValues().getProperty("roomtype");
		return roomType;
	}
	
	public String getNoOfRooms() {
		String noOfRooms= getConfigFileValues().getProperty("noofrooms");
		return noOfRooms;
	}
	
	public String getAdultsPerRoom() {
		String adultsPerRoom= getConfigFileValues().getProperty("adultsperroom");
		return adultsPerRoom;
	}
	
	public String getChildPerRoom() {
		String childPerRoom= getConfigFileValues().getProperty("childperroom");
		return childPerRoom;
	}
	
	public String getFirstName() {
		String firstName= getConfigFileValues().getProperty("firstname");
		return firstName;
	}
	
	public String getLastName() {
		String lastName = getConfigFileValues().getProperty("lastname");
		return lastName;
	}
	
	public String getAddress() {
		String address = getConfigFileValues().getProperty("address");
		return address;
	}
	
	public String getCreditCardNo() {
		String creditCardNo = getConfigFileValues().getProperty("creditcardno");
		return creditCardNo;
	}
	
	public String getCreditCardType() {
		String creditCardType = getConfigFileValues().getProperty("creditcardtype");
		return creditCardType;
	}
	
	public String getExpiryMonth() {
		String expiryMonth = getConfigFileValues().getProperty("expirymonth");
		return expiryMonth;
	}
	
	public String getExpiryYear() {
		String expiryYear = getConfigFileValues().getProperty("expiryyear");
		return expiryYear;
	}
	
	public String getCvv() {
		String cvv = getConfigFileValues().getProperty("cvv");
		return cvv;
	}
	
}
