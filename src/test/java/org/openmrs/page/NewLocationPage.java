package org.openmrs.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewLocationPage extends FormPage {

	public NewLocationPage(WebDriver driver) {
		this.driver = driver;
	}

	public void submit() {
		driver.findElement(By.name("saveLocation")).click();

	}

	public String getTitle() {
		return driver.findElement(By.xpath("//div[@id='content']/h2"))
				.getText();
	}

	protected String getPath() {
		return null;
	}

	public void setName(String name) {
		enterText("name", name);
	}

	public void setDescription(String description) {
		enterText("description", description);
	}

}
