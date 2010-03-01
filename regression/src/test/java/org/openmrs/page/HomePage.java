package org.openmrs.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
		WebElement dictionary = driver.findElement(By
				.linkText("Find/Create Patient"));
		dictionary.click();
	}
}
