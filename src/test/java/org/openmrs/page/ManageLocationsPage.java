package org.openmrs.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ManageLocationsPage extends Page {

	public ManageLocationsPage(WebDriver driver) {
		this.driver = driver;
	}

	protected String getPath() {
		return "admin/locations/location.list";
	}

	public String getTitle() {
		return driver.findElement(By.xpath("//div[@id='content']/h2"))
				.getText();
	}
}
