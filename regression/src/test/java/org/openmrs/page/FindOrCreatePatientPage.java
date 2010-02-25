package org.openmrs.page;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class FindOrCreatePatientPage extends FormPage {
	private final FirefoxDriver driver;

	public FindOrCreatePatientPage(FirefoxDriver driver) {
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
		WebElement logIn = driver.findElement(By.name("personalName"));
		logIn.submit();
	}

	public String getPath() {
		return "/findPatient.htm";
	}
}
