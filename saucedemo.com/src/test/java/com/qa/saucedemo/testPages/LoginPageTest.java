package com.qa.saucedemo.testPages;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.saucedemo.aBaseClass.BaseClass;
import com.qa.saucedemo.activityPages.LoginPage;

public class LoginPageTest extends BaseClass{
	
	LoginPage loginpage;
	
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage  = new LoginPage();
		
	}
	
	@Test
	public void LoginTest() {
		loginpage.functionLogin();
		
	}
	
	public void validatetitleAfterLogin()  {
		 String Actittle = driver.getTitle();
		 String ExpTittle = prop.getProperty("ExptitleLogin");
		Assert.assertEquals(Actittle, ExpTittle);
		if (ExpTittle.equals(ExpTittle)) {
		    System.out.println("Title Verified: Actitle and ExpTitle are equal.");
		} else {
		    System.out.println("Title Not Verified: Actitle and ExpTitle are not equal.");
		}
	}
	/*
	 * @AfterMethod public void teardown() { driver.quit(); }
	 * https://www.saucedemo.com/inventory.html
	 */

}
