package com.qa.automation.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.auotmation.pages.LoginPage;
import com.qa.auotmation.pages.ProductPage;


public class LoginTest extends ProductTest {
	
	LoginPage login ;
	ProductPage test ;
	
	@BeforeClass
	public void initialSetup() throws Exception {
				
		test= setupEnvironment();
		login = new LoginPage(driver);
		
	}
	
	
	@Test
	public void loginWithInvalidUser() throws Exception {
		login.testdriver();	
	}
	
	
	@Test
	public void loginWithInvalidPassword() throws Exception {
				
	}
	
	
	@Test
	public void loginWithCorrectCredentials() throws Exception {
				
	}
	
	
	@AfterClass
	public void endTest(){
		//driver.quit();
		
		
	}

}
