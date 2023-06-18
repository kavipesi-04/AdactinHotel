package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Utility;

public class AdactinLoginPage extends Utility{
	
	public AdactinLoginPage(){

		PageFactory.initElements(driver, this);
		}
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement loginBtn;
	
	@FindBy(xpath="//*[contains(text(),\"Invalid\")]")
	private WebElement msg;
	
	public WebElement getMsg() {
		return msg;
	}
	public void setMsg(WebElement msg) {
		this.msg = msg;
	}
	public WebElement getUsername() {
		return username;
	}
	public void setUsername(WebElement username) {
		this.username = username;
	}
	public WebElement getPassword() {
		return password;
	}
	public void setPassword(WebElement password) {
		this.password = password;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public void setLoginBtn(WebElement loginBtn) {
		this.loginBtn = loginBtn;
	}


}
