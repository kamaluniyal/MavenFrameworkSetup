package com.qa.automation.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.auotmation.pages.LoginPage;
import com.qa.auotmation.pages.ProductPage;


public class LoginTest extends ProductTest {
	
	LoginPage login ;
	ProductPage memail ;
	
	@BeforeClass
	public void initialSetup() throws Exception {
		
		System.out.println("Start test :*******************************"
				+ "********************  LoginTest  *******************************"
				+ "***************************************************");	
		memail= setupEnvironment();
		//do sign in before calling login page  
		memail.clickonElement(memail.signIn,"Memail Sign-in button");
		// wait for object
		Thread.sleep(5000);
		login = new LoginPage(driver);
		
	}
	
	
	@Test(priority=0)
	public void loginWithInvalidUser() throws Exception {
		System.out.println("Starting test :::::::::: loginWithInvalidUser ::::::::::");
		String username = "kamal";
		String password = "password";
		login.setUserNameAndPassword(username, password);
		login.clickonLogin();
		Thread.sleep(20000);
		System.out.println("Ending test :::::::::: loginWithInvalidUser ::::::::::");
	}
	
	
	@Test(priority=1)
	public void loginWithInvalidPassword() throws Exception {
		System.out.println("Starting test :::::::::: loginWithInvalidPassword ::::::::::");
		System.out.println("...");
		System.out.println("...");
		System.out.println("...");
		System.out.println("...");
		System.out.println("...");		
		System.out.println("Ending test :::::::::: loginWithInvalidPassword ::::::::::");
	}
	
	
	@Test(priority=2)
	public void loginWithCorrectCredentials() throws Exception {
		System.out.println("Starting test :::::::::: loginWithCorrectCredentials ::::::::::");
		System.out.println("...");
		System.out.println("...");
		System.out.println("...");
		System.out.println("...");
		System.out.println("...");
		System.out.println("Ending test :::::::::: loginWithCorrectCredentials ::::::::::");	
	}
	
	
	@AfterClass
	public void endTest(){
		System.out.println("End test :*******************************"
				+ "********************  LoginTest  *******************************"
				+ "***************************************************");	
		driver.quit();
		
		
	}

}
