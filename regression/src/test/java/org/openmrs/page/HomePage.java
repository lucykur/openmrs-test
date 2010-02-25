package org.openmrs.page;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class HomePage {

	private final FirefoxDriver driver;

	public HomePage(FirefoxDriver driver) {
		this.driver = driver;
	}

	public String getTitle() {
		return driver.getTitle();
	}
	
	public void clickOnFindOrCreatePatient(){
		WebElement dictionary = driver.findElement(By.linkText("Find/Create Patient"));
		dictionary.click();
	}
}
