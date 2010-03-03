package org.openmrs.test.page.patient;

import org.openmrs.test.page.FormPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FindOrCreatePatientPage extends FormPage {

	public FindOrCreatePatientPage(WebDriver driver) {
		this.driver = driver;
	}

	public void setPersonName(String personName) {
		enterText("addName", personName);
	}

	public void setBirthDate(String birthDate) {
		enterText("addBirthdate", birthDate);
	}

	public void setAge(String age) {
		enterText("addAge", age);
	}

	public void submit() {
		driver.findElement(By.name("addName")).submit();
	}

	public String getPath() {
		return "findPatient.htm";
	}

}
