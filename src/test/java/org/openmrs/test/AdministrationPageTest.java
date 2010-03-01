package org.openmrs.test;

import org.openmrs.page.AdministationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdministrationPageTest {

	@Test(dependsOnMethods = { "org.openmrs.test.LoginPageTest.shouldLoginForAValidUser" })
	public void shouldOpenAdministrationPage() {
		AdministationPage adminPage = new AdministationPage(WebDriverFactory
				.getCurrentDriver());
		adminPage.open();
		Assert.assertEquals("OpenMRS - Administration", adminPage.getTitle());
	}
}
