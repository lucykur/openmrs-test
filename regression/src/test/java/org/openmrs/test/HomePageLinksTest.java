package org.openmrs.test;

import junit.framework.Assert;

import org.openmrs.page.FindOrCreatePatient;
import org.openmrs.page.HomePage;
import org.openmrs.page.LoginPage;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageLinksTest {
	private FirefoxDriver driver;
	
	@BeforeTest
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
	}

	@AfterTest
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test(dependsOnMethods = { "org.openmrs.test.LoginPageTest.shouldLoginForAValidUser" })
	public void shouldJumpToTheAppropriateLinksPage() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.open();
		loginPage.setUser("admin");
		loginPage.setPassword("Openmr5tw");
		loginPage.submit();

		HomePage homePage = new HomePage(driver);
		homePage.clickOnDictionary();
		FindOrCreatePatient findOrCreatePatient=new FindOrCreatePatient(driver);
		assertEquals("OpenMRS - Find Patient",findOrCreatePatient.getTitle());
	}
}
