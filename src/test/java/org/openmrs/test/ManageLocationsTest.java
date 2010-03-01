package org.openmrs.test;

import org.openmrs.page.ManageLocationsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ManageLocationsTest {

	@Test(dependsOnMethods={"org.openmrs.test.AdministrationPageTest.shouldOpenAdministrationPage"})
	public void shouldOpenManageLocationsPage() {
		ManageLocationsPage manageLocationsPage = new ManageLocationsPage(
				WebDriverFactory.getCurrentDriver());
		manageLocationsPage.open();
		Assert.assertEquals("Location Management", manageLocationsPage.getTitle());
	}
}
