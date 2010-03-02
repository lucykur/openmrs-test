package org.openmrs.test;

import org.openmrs.page.FindOrCreatePatientPage;
import org.openmrs.page.NewPatientPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreatePatientTest {

	@Test(dependsOnMethods = { "org.openmrs.test.LoginPageTest.shouldLoginForAValidUser" }, groups = { "regression" })
	public void shouldOpenFindOrCreatePatientPage() {
		FindOrCreatePatientPage findOrCreatePatientPage = new FindOrCreatePatientPage(
				WebDriverFactory.getCurrentDriver());
		findOrCreatePatientPage.open();
		Assert.assertEquals("OpenMRS - Find Patient", findOrCreatePatientPage
				.getTitle());
	}

	@Test(dependsOnMethods = { "shouldOpenFindOrCreatePatientPage" }, groups = { "regression" })
	public void shouldOpenNewPatientPage() {
		FindOrCreatePatientPage findOrCreatePatientPage = new FindOrCreatePatientPage(
				WebDriverFactory.getCurrentDriver());
		findOrCreatePatientPage.setPersonName("Sample");
		findOrCreatePatientPage.setBirthDate("01/01/1991");
		findOrCreatePatientPage.setAge("18");
		findOrCreatePatientPage.submit();
		Assert.assertEquals("Create a New Patient", new NewPatientPage(
				WebDriverFactory.getCurrentDriver()).getTitle());
	}
}
