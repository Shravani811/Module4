package com.io.properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Module {

	public static WebDriver webDriver;
	static String browser;
	//method for setting the browser
	public static void setBrowser() {
		PropertiesFile.readProperties();
		browser=PropertiesFile.property.getProperty("browser");
	}
	//method to give browser location
	public static void setBrowserConfig() {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\Module4Testing\\chromedriver.exe");
		}	
	}
	//to run the scenario for given url
	public static void runTest() {
		webDriver=new ChromeDriver();
		webDriver.get(PropertiesFile.property.getProperty("url"));		
	}
	//to quit the browser
	public static void endTest() {
		webDriver.quit();
	}
}
