package org.openmrs.test;

import junit.framework.Assert;
import org.openmrs.page.HomePage;
import org.openmrs.page.LoginPage;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageLinksTests {
	 @BeforeTest
		public void setUp() throws Exception {
	 
	 }
	 
	 @AfterTest
	 public void tearDown() throws Exception{
		 
	 }
	
	@Test
	public void shouldJumpToTheAppropriateLinksPage(){
		Assert.assertEquals("abcd","defg");
	}	
}
