package com.step;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;

import com.Base.Utility;
import com.page.BookAHotelPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Confirm extends Utility {

	BookAHotelPage bp;
	
	@Given("User enters confirmation page")
	public void user_enters_confirmation_page() throws InterruptedException {
		bp = new BookAHotelPage();
		Thread.sleep(3000);
		bp.getBook().getText();
	}
	
	@When("User enters firstname")
	public void user_enters_firstname() throws IOException {
		
		bp.getFirstName().sendKeys(getConfirmData(1,0));
	}
	@When("User enters lastname")
	public void user_enters_lastname() throws IOException {
		bp.getLastName().sendKeys(getConfirmData(1,1));
	}
	@When("User enters address")
	public void user_enters_address() throws IOException {
		bp.getAddress().sendKeys(getConfirmData(1,2));
	}
	@When("User enters credit card number")
	public void user_enters_credit_card_number() throws IOException {
		
		bp.getCreditCardNo().sendKeys(getConfirmData(1,3));    
	}
	@When("User enters credit card type")
	public void user_enters_credit_card_type() throws IOException {
		Select creditCardTypeSelect =new Select(bp.getCreditCardType());
		creditCardTypeSelect.selectByVisibleText(getConfirmData(1,4));
	}
	@When("User enters expiry month")
	public void user_enters_expiry_month() throws IOException {
		Select expMonSelect =new Select(bp.getExpiryMonth());
		expMonSelect.selectByVisibleText(getConfirmData(1,5));
	}
	@When("User enters expiry year")
	public void user_enters_expiry_year() throws IOException {
		Select expYearSelect =new Select(bp.getExpiryYear());
		expYearSelect.selectByVisibleText(getNumericData(1,6));
	}
	@When("User enters cvv")
	public void user_enters_cvv() throws IOException {
		
		bp.getCvvNumber().sendKeys(getNumericData(1,7));
	}
	
	@When("User should click book now button")
	public void user_should_click_book_now_button() {
		bp.getBookNow().click();
	}
	
	@Then("User successfully booked")
	public void user_successfully_booked() throws InterruptedException {
		
		Thread.sleep(5000);
		String text = bp.getBookingConfirm().getText();
		System.out.println(text);
	}

}
