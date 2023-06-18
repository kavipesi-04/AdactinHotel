package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Utility;

public class BookAHotelPage extends Utility
{
	public BookAHotelPage(){

		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="(//*[contains(text(),'Book')])[5]")
	private WebElement book;
	
	@FindBy(id="first_name")
	private WebElement firstName;
	
	@FindBy(id="last_name")
	private WebElement lastName;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement CreditCardNo;
	
	@FindBy(id="cc_type")
	private WebElement CreditCardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement expiryMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement expiryYear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvvNumber;
	
	@FindBy(id="book_now")
	private WebElement bookNow;

	@FindBy(xpath="//*[text()='Booking Confirmation ']")
	private WebElement bookingConfirm;
	
	public WebElement getBook() {
		return book;
	}

	public void setBook(WebElement book) {
		this.book = book;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public void setAddress(WebElement address) {
		this.address = address;
	}

	public WebElement getCreditCardNo() {
		return CreditCardNo;
	}

	public void setCreditCardNo(WebElement creditCardNo) {
		CreditCardNo = creditCardNo;
	}

	public WebElement getCreditCardType() {
		return CreditCardType;
	}

	public void setCreditCardType(WebElement creditCardType) {
		CreditCardType = creditCardType;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public void setExpiryMonth(WebElement expiryMonth) {
		this.expiryMonth = expiryMonth;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public void setExpiryYear(WebElement expiryYear) {
		this.expiryYear = expiryYear;
	}

	public WebElement getCvvNumber() {
		return cvvNumber;
	}

	public void setCvvNumber(WebElement cvvNumber) {
		this.cvvNumber = cvvNumber;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

	public void setBookNow(WebElement bookNow) {
		this.bookNow = bookNow;
	}

	public WebElement getBookingConfirm() {
		return bookingConfirm;
	}

	public void setBookingConfirm(WebElement bookingConfirm) {
		this.bookingConfirm = bookingConfirm;
	}

	
}
