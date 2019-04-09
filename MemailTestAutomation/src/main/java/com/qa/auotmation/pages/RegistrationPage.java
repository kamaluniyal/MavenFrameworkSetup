package com.qa.auotmation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends ProductPage {

	
	@FindBy(xpath="//*[@id='Username']")
	private WebElement username ;
	
	@FindBy(xpath="//*[@id='Password']")
	private WebElement password ;
	
	@FindBy(xpath="//*[@id='ConfirmPassword']")
	private WebElement confirmPassword ;
	
		
	@FindBy(xpath="//button[@type='submit']")
	private WebElement continueButton ;
	
	
	public void setUserNameAndPassword(String username,String password){
		enterText(this.username,"Username",username);
		enterText(this.password,"Password",password);
	}
	
	public void clickonContinue(){
		clickonElement(continueButton,"memail_registration_continue");
	}
	
	
	public RegistrationPage(WebDriver driver){
		super(driver);
	}
}
