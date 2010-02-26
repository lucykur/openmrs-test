package org.openmrs.test;

import junit.framework.Assert;

import org.openmrs.page.FindOrCreatePatientPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreatePatientTest {
	private WebDriver driver;

	@BeforeTest
	public void setUp() throws Exception {
		driver = WebDriverFactory.getCurrentDriver();
	}

	@Test(dependsOnMethods = { "org.openmrs.test.HomePageLinksTest.shouldJumpToTheAppropriateLinksPage" })
	public void shouldCreateNewPatient() {
		FindOrCreatePatientPage findOrCreatePatientPage = new FindOrCreatePatientPage(
				driver);
		findOrCreatePatientPage.setPersonName("Sample");
		findOrCreatePatientPage.setBirthDate("01/01/1991");
		findOrCreatePatientPage.setAge("18");
		findOrCreatePatientPage.submit();
		Assert.assertTrue(driver.getPageSource().contains(
				"Create a New Patient"));
	}
}
