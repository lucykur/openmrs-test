package org.openmrs.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Page {

	public HomePage(WebDriver driver) {
		this.driver = driver;

	}

	public String getTitle() {
		return driver.getTitle();
	}

	public String getPath() {
		return "index.htm";
	}

	public void clickOnFindOrCreatePatient() {
		driver.findElement(By
				.linkText("Find/Create Patient")).click();
	}
}
