package com.qa.saucedemo.aBaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static Properties prop ;
	public static WebDriver driver ;
	
	public BaseClass() {
		prop = new Properties();
		try {	 
			FileInputStream ip = new FileInputStream("C:\\Users\\indra\\eclipse-workspace\\saucedemo.com\\src\\main\\java\\com\\qa\\saucedemo\\properties\\com.qa.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void initialization() {
		String Url = prop.getProperty("url");
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\indra\\OneDrive\\Desktop\\Chromedriver\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(Url);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}
		
		else {
			System.out.println("Invalid browser on properties file");
		}
	}

}
