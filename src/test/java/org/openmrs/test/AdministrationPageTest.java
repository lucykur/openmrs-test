package org.openmrs.test;

import org.openmrs.test.page.administration.AdministationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdministrationPageTest {

	@Test(dependsOnMethods = { "org.openmrs.test.LoginPageTest.shouldLoginForAValidUser" }, groups = {"smoke","regression"})
	public void shouldOpenAdministrationPage() {
		AdministationPage adminPage = new AdministationPage(WebDriverFactory
				.getCurrentDriver());
		adminPage.open();
		Assert.assertEquals("OpenMRS - Administration", adminPage.getTitle());
	}
}
