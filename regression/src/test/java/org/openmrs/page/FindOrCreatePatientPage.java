package org.openmrs.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FindOrCreatePatientPage extends FormPage {

	public FindOrCreatePatientPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void setPersonName(String personName) {
		enterText("personName", personName);
	}

	public void setBirthDate(String birthDate) {
		enterText("birthdate", birthDate);
	}

	public void setAge(String age) {
		enterText("age", age);
	}

	public void submit() {
		driver.findElement(By.name("addName")).submit();
	}

	public String getPath() {
		return "findPatient.htm";
	}

	public String getHeading() {
		return driver.findElement(By.xpath("//form[@action='newPatient.form']/h2")).getText();
	}
}
