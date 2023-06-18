package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Utility;

public class HotelBookPage extends Utility{
	
	public HotelBookPage(){

		PageFactory.initElements(driver, this);
		}

	@FindBy(id="username_show")
	private WebElement usernameGreet;
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotelName;
	
	@FindBy(id="room_type")
	private WebElement roomType;
	
	@FindBy(id="room_nos")
	private WebElement noOfRooms;
	
	@FindBy(id="datepick_in")
	private WebElement checkIn;
	
	@FindBy(id="datepick_out")
	private WebElement CheckOut;
	
	@FindBy(id="adult_room")
	private WebElement adultsPerRoom;
	
	@FindBy(id="child_room")
	private WebElement childrenPerRoom;
	
	@FindBy(id="Submit")
	private WebElement search;
	
	public WebElement getUsernameGreet() {
		return usernameGreet;
	}

	public void setUsernameGreet(WebElement usernameGreet) {
		this.usernameGreet = usernameGreet;
	}

	public WebElement getLocation() {
		return location;
	}

	public void setLocation(WebElement location) {
		this.location = location;
	}

	public WebElement getHotelName() {
		return hotelName;
	}

	public void setHotelName(WebElement hotelName) {
		this.hotelName = hotelName;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public void setRoomType(WebElement roomType) {
		this.roomType = roomType;
	}

	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(WebElement noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(WebElement checkIn) {
		this.checkIn = checkIn;
	}

	public WebElement getCheckOut() {
		return CheckOut;
	}

	public void setCheckOut(WebElement checkOut) {
		CheckOut = checkOut;
	}

	public WebElement getAdultsPerRoom() {
		return adultsPerRoom;
	}

	public void setAdultsPerRoom(WebElement adultsPerRoom) {
		this.adultsPerRoom = adultsPerRoom;
	}

	public WebElement getChildrenPerRoom() {
		return childrenPerRoom;
	}

	public void setChildrenPerRoom(WebElement childrenPerRoom) {
		this.childrenPerRoom = childrenPerRoom;
	}

	public WebElement getSearch() {
		return search;
	}

	public void setSearch(WebElement search) {
		this.search = search;
	}
	
	
	
}
