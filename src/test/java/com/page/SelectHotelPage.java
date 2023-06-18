package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Utility;

public class SelectHotelPage extends Utility{
	
	public SelectHotelPage() {
		
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//*[text()='Search Hotel']")	
 private WebElement selectHotel;

@FindBy(id="radiobutton_0")	
private WebElement radioBtn;

@FindBy(id="continue")	
private WebElement continueBtn;

public WebElement getSelectHotel() {
	return selectHotel;
}

public void setSelectHotel(WebElement selectHotel) {
	this.selectHotel = selectHotel;
}

public WebElement getRadioBtn() {
	return radioBtn;
}

public void setRadioBtn(WebElement radioBtn) {
	this.radioBtn = radioBtn;
}

public WebElement getContinueBtn() {
	return continueBtn;
}

public void setContinueBtn(WebElement continueBtn) {
	this.continueBtn = continueBtn;
}



}
