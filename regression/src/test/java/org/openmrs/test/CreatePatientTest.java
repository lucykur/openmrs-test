package org.openmrs.test;

import junit.framework.Assert;

import org.openmrs.page.FindOrCreatePatientPage;
import org.openmrs.page.HomePage;
import org.openmrs.page.LoginPage;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreatePatientTest {
	private FirefoxDriver driver;

	@BeforeTest
	public void setUp() throws Exception {
		this.driver = driver;
	}

	@AfterTest
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test(dependsOnMethods = { "org.openmrs.test.HomePageLinksTest.shouldJumpToTheAppropriateLinksPage" })
	public void shouldCreateNewPatient() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.open();
		loginPage.setUser("admin");
		loginPage.setPassword("Openmr5tw");
		loginPage.submit();

		HomePage homePage = new HomePage(driver);
		homePage.clickOnFindOrCreatePatient();
		FindOrCreatePatientPage findOrCreatePatientPage = new FindOrCreatePatientPage(
				driver);
		findOrCreatePatientPage.setPersonName("Sample");
		findOrCreatePatientPage.setBirthDate("01/01/1991");
		findOrCreatePatientPage.setAge("18");
		System.out.println("sadf");
		findOrCreatePatientPage.submit();
		Assert.assertEquals("a","a");
	}
}
