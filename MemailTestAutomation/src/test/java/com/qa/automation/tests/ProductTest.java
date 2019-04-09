package com.qa.automation.tests;

import com.qa.automation.common.GlobalDriver;
import com.qa.automation.common.PropertyReader;

import java.io.IOException;

import com.qa.auotmation.pages.ProductPage;

public class ProductTest extends TestBase {
	
	ProductPage page ;
	GlobalDriver gDriver ;
	PropertyReader propertyReader ;
	
	public ProductPage setupEnvironment() throws InterruptedException, IOException{
		
		gDriver = new GlobalDriver();
		driver = gDriver.init();
		propertyReader = new PropertyReader("Configuration.properties");
				
		String username=propertyReader.getFieldValue("AzureLoginUserName");
		String password=propertyReader.getFieldValue("AzureUserPassword");
		String url =propertyReader.getFieldValue("URL");
		
		page = new ProductPage(driver);
		page.navigate(url);
		page.login(username ,password);
		
		return page ;
		
	}
	
	

}
