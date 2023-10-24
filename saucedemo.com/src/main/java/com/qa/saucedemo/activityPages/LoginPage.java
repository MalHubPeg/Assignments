package com.qa.saucedemo.activityPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.saucedemo.aBaseClass.BaseClass;

public class LoginPage extends BaseClass {

	
	@FindBy(xpath = "//input[@id='user-name']")
	  WebElement username;
	  
	@FindBy(xpath = "//input[@id='password']")
	  WebElement password;
	  
	@FindBy(xpath = "//input[@id='login-button']")
	  WebElement LoginBtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void functionLogin() {
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		LoginBtn.click();
	}
	
	
	}
	  
	


