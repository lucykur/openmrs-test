package org.openmrs.page;

import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage {

	private final FirefoxDriver driver;

	public HomePage(FirefoxDriver driver) {
		this.driver = driver;
	}

	public String getTitle() {
		return driver.getTitle();
	}

}
