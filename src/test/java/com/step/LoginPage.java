package com.step;

import java.io.IOException;

import com.Base.Utility;
import com.page.AdactinLoginPage;
import com.page.HotelBookPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends Utility{
	
	AdactinLoginPage lp;
	HotelBookPage bp;

	@Given("User enters the Adactin page")
	public void user_enters_the_adactin_page() {
		
		browserLaunch("https://adactinhotelapp.com/HotelAppBuild2/");
	}
	@When("User enters username and password")
	public void user_enters_username_and_password() throws IOException {
		
		//data driven framework
		lp=new AdactinLoginPage();
		lp.getUsername().sendKeys(getData(1,0));
		lp.getPassword().sendKeys(getData(1,1));
		
	}
	@When("User clicks the login Button")
	public void user_clicks_the_login_button() {
		lp.getLoginBtn().click();
		
	}
	@Then("verify whether enters the booking page")
	public void verify_whether_enters_the_booking_page() {
		
		/*String text = lp.getMsg().getText();
		String[] split = text.split(" ");
		if(split[0]=="Invalid")
		{
			System.out.println("Invalid user");
			
		}
		else
		{*/
		   bp=new HotelBookPage();
		   String text = bp.getUsernameGreet().getAttribute("value");
			System.out.println(text);
		//}
	}
}
