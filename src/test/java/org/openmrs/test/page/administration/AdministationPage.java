package org.openmrs.test.page.administration;

import org.openmrs.test.page.Page;
import org.openqa.selenium.WebDriver;

public class AdministationPage extends Page {

	public AdministationPage(WebDriver driver) {
		this.driver = driver;
	}

	protected String getPath() {
		return "admin/index.htm";
	}

}
