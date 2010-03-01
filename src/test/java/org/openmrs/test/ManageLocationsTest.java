package org.openmrs.test;

import org.openmrs.page.ManageLocationsPage;
import org.openmrs.page.NewLocationPage;
import org.openmrs.page.Page;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ManageLocationsTest {

	@Test(dependsOnMethods = { "org.openmrs.test.AdministrationPageTest.shouldOpenAdministrationPage" })
	public void shouldOpenManageLocationsPage() {
		Page manageLocationsPage = new ManageLocationsPage(WebDriverFactory
				.getCurrentDriver());
		manageLocationsPage.open();
		Assert.assertEquals("Location Management", manageLocationsPage
				.getTitle());
	}

	@Test(dependsOnMethods = { "shouldOpenManageLocationsPage" })
	public void shouldOpenNewLocationPage() throws Exception {
		ManageLocationsPage manageLocationsPage = new ManageLocationsPage(
				WebDriverFactory.getCurrentDriver());
		manageLocationsPage.addLocation();
		NewLocationPage newLocationPage = new NewLocationPage(WebDriverFactory
				.getCurrentDriver());
		Assert.assertEquals("Location", newLocationPage.getTitle());
	}

	@Test(dependsOnMethods = { "shouldOpenNewLocationPage" })
	public void shouldAddNewLocation() throws Exception {
		NewLocationPage newLocationPage = new NewLocationPage(WebDriverFactory
				.getCurrentDriver());
		newLocationPage.setName("TestLocation");
		newLocationPage.setDescription("Test Description");
		newLocationPage.submit();
		Assert.assertEquals("Location saved", new ManageLocationsPage(
				WebDriverFactory.getCurrentDriver()).getMessage());
	}

	@Test(dependsOnMethods = { "shouldAddNewLocation" })
	public void shouldDeleteLocation() throws Exception {
		ManageLocationsPage manageLocationsPage = new ManageLocationsPage(
				WebDriverFactory.getCurrentDriver());
		manageLocationsPage.deleteLocation("TestLocation");
		Assert.assertTrue(manageLocationsPage.getMessage().contains("deleted"));
	}
}
