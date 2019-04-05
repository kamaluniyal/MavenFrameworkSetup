package com.qa.auotmation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
	
	protected WebDriver driver ;
	
	
	public void clickonElement(WebElement element,String description){
		try{
			System.out.println("Trying to click on "+description);
			element.click();
			System.out.println(description+" has been clicked successfully");
		}
		catch(Exception e){
			System.out.println("Error clicking on "+description);
			System.out.println("Error description : "+e.getMessage());
		}
	}
	
	public void enterText(WebElement element,String description , String text){
		try{
			System.out.println("Trying to enter "+text+" on "+description);
			element.sendKeys(text);
			System.out.println(text+" entered successfully in"+description);
		}
		catch(Exception e){
			System.out.println("Error entering text in"+description);
			System.out.println("Error description : "+e.getMessage());
		}
	}
	
	public void verifyElementText(WebElement element,String description , String expectedText){
		try{
			System.out.println("Verifying text of : "+description);
			if(expectedText.equals(element.getText())){
				System.out.println("Text verification PASSED");
			}
			else{
				System.out.println("Text verification FAILED");
				System.out.println("Expected text : "+expectedText);
				System.out.println("Actual text : "+element.getText());
			}
			
		}
		catch(Exception e){
			System.out.println("Error verifying text of"+description);
			System.out.println("Error description : "+e.getMessage());
		}
	}
	
	
	PageBase(WebDriver driver){
		this.driver = driver ;
		PageFactory.initElements(driver,this);
	}

}
