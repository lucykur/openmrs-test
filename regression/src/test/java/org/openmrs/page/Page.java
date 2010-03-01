package org.openmrs.page;

import org.openmrs.Host;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class Page {

	protected WebDriver driver;

	public void open() {
		driver.navigate().to("http://" + new Host().getAddress() + "/openmrs/" + getPath());
	}

	protected abstract String getPath();

	protected void enterText(String field, String value) {
		driver.findElement(By.id(field)).sendKeys(value);
	}

}
