package org.openmrs.page;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FindOrCreatePatient {
	private final FirefoxDriver driver;

	public FindOrCreatePatient(FirefoxDriver driver) {
		this.driver = driver;
	}

	public String getTitle() {
		return driver.getTitle();
	}
}
