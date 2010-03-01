package org.openmrs.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Page {

	public HomePage(WebDriver driver) {
		this.driver = driver;

	}

	public String getPath() {
		return "index.htm";
	}

	public void displayCreatePatientPage() {
		driver.findElement(By
				.linkText("Find/Create Patient")).click();
	}

	public void displayAdministationPage() {
		// TODO Auto-generated method stub
		
	}
}
