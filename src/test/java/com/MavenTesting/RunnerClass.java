package com.MavenTesting;

import com.POM_Manager.PageObjectManager;

public class RunnerClass extends BaseClass {
	public static void main(String[] args) {
		PageObjectManager pom=new PageObjectManager();
		browserLaunch(pom.getReader().getBrowserName());
		getUrl(pom.getReader().getUrl());
		pom.getLoginPage().getLoginPageElements();
		pom.getSearch().getSearchElements();
		pom.getSelect().getSelectPageElements();
		pom.getBook().getBookHotelElements();
		pom.getLogOut().getLogOutElements();
	}
}
