package org.openmrs.test.page.home;

import org.openmrs.test.page.Page;
import org.openqa.selenium.WebDriver;

public class HomePage extends Page {

	public HomePage(WebDriver driver) {
		this.driver = driver;

	}

	public String getPath() {
		return "index.htm";
	}

}
