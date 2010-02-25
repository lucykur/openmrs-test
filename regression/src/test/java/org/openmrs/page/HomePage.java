package org.openmrs.page;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class HomePage extends Page {

	private final FirefoxDriver driver;

	public HomePage(FirefoxDriver driver) {
		this.driver = driver;
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public String getPath() {
		return "/findPatient.htm";
	}

	public void clickOnFindOrCreatePatient() {
		WebElement dictionary = driver.findElement(By
				.linkText("Find/Create Patient"));
		dictionary.click();
	}
}
