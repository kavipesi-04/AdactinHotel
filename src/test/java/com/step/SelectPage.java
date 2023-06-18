package com.step;

import com.page.SelectHotelPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SelectPage {

	SelectHotelPage sp;
	
	@Given("User enters Select Page")
	public void user_enters_select_page() {
		
		sp=new SelectHotelPage();
		System.out.println(sp.getSelectHotel().getText());
		
	}
	@When("User selects the radio button")
	public void user_selects_the_radio_button() {
		
		
		sp.getRadioBtn().click();
	}
	@When("User clicks continue Button")
	public void user_clicks_continue_button() {
		
		sp.getContinueBtn().click();
	}
	@Then("Verify user enters confirmation page")
	public void verify_user_enters_confirmation_page() {
		
		System.out.println("user enters confirmation page");
	}
	
}
