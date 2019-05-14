package com.io.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ConferenceRegistration {
	static WebDriver webDriver;
	public ConferenceRegistration(WebDriver webDriver) {
		this.webDriver=webDriver;
	}
	//fetching values from html page by name
	By firstName=By.name("txtFN");
	By lastName=By.name("txtLN");
	By email=By.name("Email");
	By contactNo=By.name("Phone");
	By noOfPeople=By.name("size");
	By buildingName=By.name("Address");
	By areaName=By.name("Address2");
	By city=By.name("city");
	By state=By.name("state");
	By conferenceAccess=By.name("memberStatus");
	
	//methods for sending values that enters automatically in fields
	public void givingFirstName() {
		System.out.println(webDriver.getTitle());
		webDriver.findElement(firstName).sendKeys("Shravani");
	}
	
	public void givingLastName() {
		webDriver.findElement(lastName).sendKeys("Mukka");
	}
	
	public void givingEmail() {
		webDriver.findElement(email).sendKeys("shravani97@gmail.com");
	}
	
	public void givingInvalidContact() {
		webDriver.findElement(contactNo).sendKeys("7098798");
	}
	public void givingContact() {
		webDriver.findElement(contactNo).clear();
		webDriver.findElement(contactNo).sendKeys("7098798765");
	}
	
	public void givingNoOfPeople() {
		Select drpCountry = new Select(webDriver.findElement(noOfPeople));
		drpCountry.selectByVisibleText("1");
	}
	
	public void givingBuildingName() {
		webDriver.findElement(buildingName).sendKeys("Gracy building");
	}
	
	public void givingAreaName() {
		webDriver.findElement(areaName).sendKeys("mehdipatnam");
	}
	
	public void givingCity() {
		Select drpCountry = new Select(webDriver.findElement(city));
		drpCountry.selectByVisibleText("Hyderabad");
	}
	
	public void givingState() {
		Select drpCountry = new Select(webDriver.findElement(state));
		drpCountry.selectByVisibleText("Telangana");
	}
	
	public void givingConferenceAccess() {
		WebElement radio = webDriver.findElement(conferenceAccess);
		radio.click();
	}
	
	public void clickNext() throws InterruptedException {
		webDriver.findElement(By.linkText("Next")).click();
		Thread.sleep(3000);
		webDriver.switchTo().alert().accept();
	}
}
