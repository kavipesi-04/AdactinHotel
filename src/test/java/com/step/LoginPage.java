package com.step;

import java.io.IOException;

import com.Base.Utility;
import com.Exception.UserNotFound;
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
	public void user_enters_username_and_password() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//data driven framework
		lp=new AdactinLoginPage();
		lp.getUsername().sendKeys(getData(1,0));
		Thread.sleep(3000);
		lp.getPassword().sendKeys(getData(1,1));
		
	}
	
	@When("User enters wrong {string} and {string}")
	public void user_enters_wrong_and(String string, String string2) throws UserNotFound, InterruptedException {

		lp=new AdactinLoginPage();
		lp.getUsername().sendKeys(string);
		Thread.sleep(3000);
		lp.getPassword().sendKeys(string2);
	
	}
	
	/*@When("User enters wrong Aishwarya and Aishwarya")
	public void user_enters_wrong_aishwarya_and_aishwarya() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	*/
	@When("User clicks the login Button")
	public void user_clicks_the_login_button() throws InterruptedException {
		Thread.sleep(3000);
		lp.getLoginBtn().click();
		
	}
	@When("User clicks the login Button after incorrect credentials")
	public void user_clicks_the_login_button_after_incorrect_credentials() throws UserNotFound {
 throw new UserNotFound();
	
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
