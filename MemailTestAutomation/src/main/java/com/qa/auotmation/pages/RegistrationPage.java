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
	
	@FindBy(xpath="//*[@id='Password-error']/div/p")
	private WebElement errorMessage ;
	
	@FindBy(xpath="")
	private WebElement registerButton ;
	
	
	public void setUserNameAndPassword(String username,String password){
		enterText(this.username,"Username",username);
		enterText(this.password,"Password",password);
	}
	
	public void clickonRegister(){
		clickonElement(registerButton,"memail_register");
	}
	
	public void verifyErrorMessage(String expectedErrorMsg){
		verifyElementText(errorMessage,"Error message",expectedErrorMsg);
	}
	
	
	public RegistrationPage(WebDriver driver){
		super(driver);
	}
}
