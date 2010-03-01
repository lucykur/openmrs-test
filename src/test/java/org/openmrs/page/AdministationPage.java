package org.openmrs.page;

import org.openqa.selenium.WebDriver;

public class AdministationPage extends Page {

	public AdministationPage(WebDriver driver) {
		this.driver = driver;
	}

	protected String getPath() {
		return "admin/index.htm";
	}

}
