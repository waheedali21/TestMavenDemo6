package com.demo.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.demo.testbase.BaseTest;

public class TestCase1 extends BaseTest{
	
/*	
	@BeforeSuite
	public void loadConfigTest() throws Exception {
		BaseTest.loadConfig();
	}
	
*/	
	
	@Parameters("browser")
	@BeforeMethod
	public void setUpBrowser(String browser) throws Exception {
		
		BaseTest.browserSetUp(browser);
		//BaseTest.loadConfig();
	}
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
   //Test cases
	
	@Test
	public void doVerifyTitle() {
		String currentTitle = driver.getTitle();
		System.out.println("Title: " + currentTitle);
		Assert.assertEquals(currentTitle, driver.getTitle());
		
	}
	
	
	@Test
	public void doVerifyURL() {
		String currentURL = driver.getCurrentUrl();
		System.out.println("URL: " + currentURL);
		Assert.assertEquals(currentURL, driver.getCurrentUrl());
	}
	
	
	

}
