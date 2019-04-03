package com.qa.auotmation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends ProductPage {
	
	
	@FindBy(xpath="//*[@id='mainbody']/header/div[1]/div/div/div/ul[2]/li[1]/a")
	WebElement signIn;
	
	
	
	
	public void testdriver(){
		System.out.println("inside testdriver of loginPage ");
		//driver.navigate().back();
		signIn.click();
	}
	
	
	public LoginPage(WebDriver driver){
		//PageFactory.initElements(driver,this.getClass());
		super(driver);
	}

}
