package com.qa.auotmation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends PageBase {

	
	@FindBy(xpath="//*[@id='i0116']")
	public WebElement id ;
	
	@FindBy(xpath="//*[@id='i0118']")
	public WebElement _password ;
	
	@FindBy(xpath="//*[@id='idSIButton9']")
	public WebElement login ;
	
	@FindBy(xpath="//*[@id='mainbody']/header/div[1]/div/div/div/ul[2]/li[1]/a")
	public WebElement signIn;
	
	@FindBy(xpath="")
	public WebElement registerLink;
	
	
public ProductPage navigate(String url){
		
		System.out.println("Navigating to "+url);
		driver.get(url);
		ProductPage pp = new ProductPage(driver);
				
		return pp;
	}
	
	
	public void login(String username , String password) throws InterruptedException{
		
		System.out.println("in login");
		id.sendKeys(username);
		login.click();
		Thread.sleep(5000);
		this._password.sendKeys(password);
		login.click();
		// wait for objects 
		Thread.sleep(5000);
		login.click();
		//wait for objects
		Thread.sleep(5000);
		System.out.println("login complete");
		
	}
	
	
	public ProductPage(WebDriver driver) {
		super(driver);
		
	}

}
