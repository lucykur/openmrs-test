package org.openmrs.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
		WebElement logIn = driver.findElement(By.name("addName"));
		logIn.submit();
	}

	public String getPath() {
		return "findPatient.htm";
	}
}
