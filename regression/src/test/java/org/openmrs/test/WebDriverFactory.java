package org.openmrs.test;

import org.openqa.selenium.WebDriver;

public class WebDriverFactory {

	private static WebDriver driver;

	public static WebDriver getCurrentDriver() {
		return driver;
	}

	public static void setCurrentDriver(WebDriver driver) {
		WebDriverFactory.driver = driver;
	}

	public static void closeCurrentDriver() {
		driver.close();
	}

}
