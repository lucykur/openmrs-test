package org.openmrs.test.page;

import org.openmrs.test.parameter.Host;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class Page {

	protected WebDriver driver;

	public void open() {
        Host host = new Host();
        String url = String.format("http://%s:%s/openmrs/%s", host.getAddress(),host.getPort(),getPath());
		driver.navigate().to(url);
	}

	protected abstract String getPath();

	protected void enterText(String field, String value) {
		driver.findElement(By.name(field)).sendKeys(value);
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public String getMessage() {
		return driver.findElement(By.xpath("//div[@id='openmrs_msg']")).getText();
	}

}
