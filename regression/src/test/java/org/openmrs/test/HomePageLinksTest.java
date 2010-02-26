package org.openmrs.test;

import junit.framework.Assert;

import org.openmrs.page.FindOrCreatePatientPage;
import org.openmrs.page.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageLinksTest {
	private WebDriver driver;

	@BeforeTest
	public void setUp() throws Exception {
		driver = WebDriverFactory.getCurrentDriver();
	}

	@Test(dependsOnMethods = { "org.openmrs.test.LoginPageTest.shouldLoginForAValidUser" })
	public void shouldJumpToTheAppropriateLinksPage() {

		HomePage homePage = new HomePage(driver);
		homePage.clickOnFindOrCreatePatient();
		FindOrCreatePatientPage findOrCreatePatientPage = new FindOrCreatePatientPage(
				driver);
		Assert.assertEquals("OpenMRS - Find Patient", findOrCreatePatientPage
				.getTitle());
	}
}
