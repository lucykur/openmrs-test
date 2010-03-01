package org.openmrs.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewPatientPage extends FormPage {

	public NewPatientPage(WebDriver driver) {
		this.driver = driver;
	}

	public void submit() {

	}

	protected String getPath() {
		return null;
	}

	public String getTitle() {
		return driver.findElement(
				By.xpath("//form[@action='newPatient.form']/h2")).getText();
	}
}
