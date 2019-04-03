package com.qa.automation.tests;

import com.qa.automation.common.GlobalDriver;
import com.qa.auotmation.pages.ProductPage;

public class ProductTest extends TestBase {
	
	ProductPage page ;
	GlobalDriver gDriver ;
	
	public ProductPage setupEnvironment() throws InterruptedException{
		
		gDriver = new GlobalDriver();
		driver = gDriver.init();
				
		String username="pratiksha.Naithani@wikaad.com" ;
		String password="app7pk@$3%" ;
		
		page = new ProductPage(driver);
		page.navigate("https://memail.azurewebsites.net");
		page.login(username ,password);
		
		return page ;
		
	}
	
	

}
