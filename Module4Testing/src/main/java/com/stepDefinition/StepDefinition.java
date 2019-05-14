package com.stepDefinition;

import org.junit.Assert;
import com.io.pom.ConferenceRegistration;
import com.io.pom.PaymentDetails;
import com.io.properties.Module;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	static ConferenceRegistration conferenceReg = null;
	static PaymentDetails pay = null;
	
	@Given("^user is getting registering$")
	public void user_is_getting_registering() throws Throwable {
		Module.setBrowser();
		Module.setBrowserConfig();
		Module.runTest();
		conferenceReg = new ConferenceRegistration(Module.webDriver);
		pay = new PaymentDetails(Module.webDriver);
	   
	}

	@When("^title of page is conference registration$")
	public void title_of_page_is_conference_registration() throws Throwable {
	   String title = Module.webDriver.getTitle();
	   Assert.assertEquals("Conference Registration", title);
	}

	@Then("^user is entering first name$")
	public void user_is_entering_first_name() throws Throwable {
		conferenceReg.clickNext();
		conferenceReg.givingFirstName();
	}

	@Then("^user is entering last name$")
	public void user_is_entering_last_name() throws Throwable {
		conferenceReg.clickNext();
		conferenceReg.givingLastName();
	}

	@Then("^user is entering email$")
	public void user_is_entering_email() throws Throwable {
		conferenceReg.clickNext();
		conferenceReg.givingEmail();
	}

	@Then("^user is entering contact number$")
	public void user_is_entering_contact_number() throws Throwable {
		conferenceReg.clickNext();
		conferenceReg.givingInvalidContact();
		conferenceReg.clickNext();
		conferenceReg.givingContact();
	}

	@Then("^user selects no of people$")
	public void user_selects_no_of_people() throws Throwable {
		conferenceReg.clickNext();
		conferenceReg.givingNoOfPeople();
	}

	@Then("^user is entering building name and room no$")
	public void user_is_entering_building_name_and_room_no() throws Throwable {
		conferenceReg.clickNext();
		conferenceReg.givingBuildingName();
	}

	@Then("^user is entering area name$")
	public void user_is_entering_area_name() throws Throwable {
		conferenceReg.clickNext();
		conferenceReg.givingAreaName();
	}

	@Then("^user selects city$")
	public void user_selects_city() throws Throwable {
		conferenceReg.clickNext();
		conferenceReg.givingCity();
	}

	@Then("^user selects state$")
	public void user_selects_state() throws Throwable {
		conferenceReg.clickNext();
		conferenceReg.givingState();
	}

	@Then("^user selects conference access$")
	public void user_selects_conference_access() throws Throwable {
		conferenceReg.clickNext();
		conferenceReg.givingConferenceAccess();
	}

	@Then("^click on next$")
	public void click_on_next() throws Throwable {
		conferenceReg.clickNext();
	}

	@Then("^title of page is payment details$")
	public void title_of_page_is_payment_details() throws Throwable {
	    String title = Module.webDriver.getTitle();
	    Assert.assertEquals("Payment Details", title);
	}

	@Then("^user is entering card holder name$")
	public void user_is_entering_card_holder_name() throws Throwable {
	   pay.clickNext();
	   pay.giveCardHolderName();
	}

	@Then("^user is entering debit card number$")
	public void user_is_entering_debit_card_number() throws Throwable {
	   pay.clickNext();
	   pay.giveDebitCardName();
	}

	@Then("^user is entering cvv number$")
	public void user_is_entering_cvv_number() throws Throwable {
	   pay.clickNext();
	   pay.giveCvvNumber();
	}

	@Then("^user is entering card expiration month$")
	public void user_is_entering_card_expiration_month() throws Throwable {
	   pay.clickNext();
	   pay.giveCardExpiryMonth();
	}

	@Then("^user is entering card expiration year$")
	public void user_is_entering_card_expiration_year() throws Throwable {
	   pay.clickNext();
	   pay.giveCardExpiryYear();
	}

	@Then("^click on Make Payment$")
	public void click_on_Make_Payment() throws Throwable {
	   pay.clickNext();
	   Module.endTest();
	}


}
