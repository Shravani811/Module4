package com.io.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentDetails {

	WebDriver webDriver;

	public PaymentDetails(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	//fetching values from html page
	By cardHolderName=By.name("txtFN");
	By debitCardNo=By.name("debit");
	By cvvNumber=By.name("cvv");
	By cardExpiryMonth=By.name("month");
	By cardExpiryYear=By.name("year");
	
	//methods for sending values to html fields
	public void giveCardHolderName() {
		webDriver.findElement(cardHolderName).sendKeys("Shravani");
	}
	
	public void giveDebitCardName() {
		webDriver.findElement(debitCardNo).sendKeys("12347887");
	}
	
	public void giveCvvNumber() {
		webDriver.findElement(cvvNumber).sendKeys("123");
	}
	
	public void giveCardExpiryMonth() {
		webDriver.findElement(cardExpiryMonth).sendKeys("January");
	}
	
	public void giveCardExpiryYear() {
		webDriver.findElement(cardExpiryYear).sendKeys("2031");
	}
	
	public void clickNext() throws InterruptedException {
		webDriver.findElement(By.id("btnPayment")).click();
		Thread.sleep(5000);
		webDriver.switchTo().alert().accept();
	}
	
}
