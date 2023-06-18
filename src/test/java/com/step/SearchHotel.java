package com.step;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Base.Utility;
import com.page.HotelBookPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchHotel extends Utility{
	
	HotelBookPage hp;

	@Given("User enters the Search Hotel page")
	public void user_enters_the_search_hotel_page() {
		hp=new HotelBookPage();
		System.out.println("Entered Search Hotel Page");
	}
	@When("User enters the Location")
	public void user_enters_the_location() throws IOException {
		Select locSelect = new Select(hp.getLocation());
		locSelect.selectByVisibleText(getSearchHotelData(1,0));
	}
	@When("User enters the hotel name")
	public void user_enters_the_hotel_name() throws IOException {
		Select hotelNameSelect = new Select(hp.getHotelName());
		hotelNameSelect.selectByVisibleText(getSearchHotelData(1,1));
	}
	@When("user enters the room type")
	public void user_enters_the_room_type() throws IOException{
		Select roomSelect = new Select(hp.getRoomType());
		roomSelect.selectByVisibleText(getSearchHotelData(1,2));
	}
	@When("user enters the Number of rooms")
	public void user_enters_the_number_of_rooms() throws IOException{
		Select noOfRoomsSelect = new Select(hp.getNoOfRooms());
		noOfRoomsSelect.selectByVisibleText(getSearchHotelData(1,3));
	}
	@When("user enters the Check in date")
	public void user_enters_the_check_in_date() throws IOException {
		hp.getCheckIn().clear();
		hp.getCheckIn().sendKeys(getSearchHotelData(1,4));
	}
	@When("user enters the check out date")
	public void user_enters_the_check_out_date() throws IOException {
		hp.getCheckOut().clear();
		hp.getCheckOut().sendKeys(getSearchHotelData(1,5));
	}
	@When("user enters the adults per room")
	public void user_enters_the_adults_per_room() throws IOException {
		Select adultsPerRoomSelect = new Select(hp.getAdultsPerRoom());
		adultsPerRoomSelect.selectByVisibleText(getSearchHotelData(1,6));
	}
	@When("user enters the child per room")
	public void user_enters_the_child_per_room() throws IOException {
		Select childPerRoom = new Select(hp.getChildrenPerRoom());
		childPerRoom.selectByVisibleText(getSearchHotelData(1,7));
	}
	@When("User enters the search button")
	public void user_enters_the_search_button() {
		
		hp.getSearch().click();
	}
	@Then("verify user enters select page")
	public void verify_user_enters_select_page() {
		
	}

	
	
}
