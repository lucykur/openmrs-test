package org.openmrs.page;

import org.openmrs.Host;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class Page {

	protected WebDriver driver;

	public void open() {
		String url = String.format("http://%s/openmrs/%s",new Host().getAddress(),getPath());
		driver.navigate().to(url);
	}

	protected abstract String getPath();

	protected void enterText(String field, String value) {
		driver.findElement(By.id(field)).sendKeys(value);
	}

}
