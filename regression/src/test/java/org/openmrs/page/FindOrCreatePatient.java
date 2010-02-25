package org.openmrs.page;

public class FindOrCreatePatient {
	private final FirefoxDriver driver;

	public FindOrCreatePatient(FirefoxDriver driver) {
		this.driver = driver;
	}

	public String getTitle() {
		return driver.getTitle();
	}
}
