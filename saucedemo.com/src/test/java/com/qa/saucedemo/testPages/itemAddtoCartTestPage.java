package com.qa.saucedemo.testPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.saucedemo.aBaseClass.BaseClass;
import com.qa.saucedemo.activityPages.LoginPage;
import com.qa.saucedemo.activityPages.itemAddtoCart;

public class itemAddtoCartTestPage extends BaseClass{
	LoginPage loginpage;
	itemAddtoCart addtoCartPage;
	
	public itemAddtoCartTestPage() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new LoginPage();
		addtoCartPage = new itemAddtoCart();
		loginpage.functionLogin();
	}
	
	@Test
	public void verifyCart() {
		addtoCartPage.AddItem();
		addtoCartPage.Gotocart();
		 
		
	}
	public void verifyCartPagetitleAndItem() {
		String AcUrl = driver.getCurrentUrl();
		String ExpUrl = prop.getProperty("CartExpUrl");
		Assert.assertEquals(AcUrl, ExpUrl);
		if(AcUrl.equals(AcUrl)) {
			System.out.println("Url verified");
		}
		else {
			System.out.println("Url Not verified");
		}
		addtoCartPage.verifytheItemAddedSuccessfully();
	}
}




