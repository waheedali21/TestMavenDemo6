package com.demo.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.demo.testbase.BaseTest;

public class TestCase2 extends BaseTest {

	public class TestCase1 extends BaseTest{
		
		
	
		
		
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
		
		
		

	@Test
	public void doVerifyTitle() {
		String currentTitle = driver.getTitle();
		Assert.assertEquals(currentTitle, driver.getTitle());

	}

	@Test
	public void doVerifyURL() {
		String currentURL = driver.getCurrentUrl();
		Assert.assertEquals(currentURL, driver.getCurrentUrl());
	}


	}
	
}
