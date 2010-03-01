package org.openmrs.test;


import org.openmrs.page.FindOrCreatePatientPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreatePatientTest {
	private WebDriver driver;

	@BeforeTest
	public void setUp() throws Exception {
		driver = WebDriverFactory.getCurrentDriver();
	}

	@Test(dependsOnMethods = { "org.openmrs.test.HomePageLinksTest.shouldDisplayFindOrCreatePatientPage" })
	public void shouldCreateNewPatient() {
		FindOrCreatePatientPage findOrCreatePatientPage = new FindOrCreatePatientPage(
				driver);
		findOrCreatePatientPage.setPersonName("Sample");
		findOrCreatePatientPage.setBirthDate("01/01/1991");
		findOrCreatePatientPage.setAge("18");
		findOrCreatePatientPage.submit();
		Assert.assertEquals("Create a New Patient", findOrCreatePatientPage.getHeading());
	}
}
