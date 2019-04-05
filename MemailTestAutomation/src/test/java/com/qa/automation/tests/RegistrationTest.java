package com.qa.automation.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.auotmation.pages.LoginPage;
import com.qa.auotmation.pages.ProductPage;
import com.qa.auotmation.pages.RegistrationPage;

public class RegistrationTest extends ProductTest {

	

	RegistrationPage registration;
	ProductPage memail ;
	
	
	@BeforeClass
	public void initialSetup() throws Exception {
		
		System.out.println("Start test :*******************************"
				+ "********************  RegistrationTest  *******************************"
				+ "***************************************************");	
		memail= setupEnvironment();
		memail.clickonElement(memail.registerLink, "memail registration link");
		Thread.sleep(3000);
		RegistrationPage register = new RegistrationPage(driver);
		
		
		
	}
	
	
	@Test(priority=0)
	public void registerUser() throws Exception {
		System.out.println("Starting test :::::::::: registerUser ::::::::::");
		registration.setUserNameAndPassword("test","test123");
		registration.clickonRegister();
		registration.verifyErrorMessage("test");
		System.out.println("Ending test :::::::::: registerUser ::::::::::");
	}
}
