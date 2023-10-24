package com.qa.saucedemo.activityPages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.saucedemo.aBaseClass.BaseClass;

public class itemAddtoCart extends BaseClass {
	
	long pageloadtime = 10;
	
	@FindBy(xpath="//a[@id='item_4_title_link' ]")
	WebElement Sauce_Labs_Backpack;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement Add_to_Cart_Btn1;
	@FindBy(xpath="//a[@id='item_0_title_link' ]")
	WebElement Sauce_Labs_Bike_Light;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
	WebElement Add_to_Cart_Btn2;
	@FindBy(xpath = "//span[@class='shopping_cart_badge']")
	WebElement CartIndication;
	@FindBy(xpath ="//div[@id='shopping_cart_container']")
	WebElement cartContainer;


	public itemAddtoCart() {
		PageFactory.initElements(driver, this);
	}

	public void AddItem() {
		if( Sauce_Labs_Backpack.isDisplayed()) {
			Add_to_Cart_Btn1.click();
		}
		else {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(pageloadtime));
			wait.until(ExpectedConditions.visibilityOfElementLocated((By.ByXPath) Sauce_Labs_Backpack));
		}
		
		if(Sauce_Labs_Bike_Light.isDisplayed()) {
			Add_to_Cart_Btn2.click();
		}
		else {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(pageloadtime));
			wait.until(ExpectedConditions.visibilityOfElementLocated((By.ByXPath) Sauce_Labs_Backpack));
		}
		
	}
	
	public void Gotocart() {
		cartContainer.click();
		try {
		    Thread.sleep(TimeUnit.SECONDS.toMillis(10));
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
	}
	
	public void verifytheItemAddedSuccessfully() {
		if( Sauce_Labs_Backpack.isDisplayed()) {
			System.out.println("Item Present in the Cart");
		}
		else {
			System.out.println("Item Not Present");
		}
		
		if(Sauce_Labs_Bike_Light.isDisplayed()) {
			System.out.println("Item Present in the Cart");
		}
		else {
			System.out.println("Item Not Present");
		}
		}
		
	}






