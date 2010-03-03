package org.openmrs.test.page.administration;

import java.net.URI;
import java.net.URISyntaxException;

import org.openmrs.test.page.Page;
import org.openmrs.test.util.QueryParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManageLocationsPage extends Page {

	public ManageLocationsPage(WebDriver driver) {
		this.driver = driver;
	}

	protected String getPath() {
		return "admin/locations/location.list";
	}

	public String getTitle() {
		return driver.findElement(By.xpath("//div[@id='content']/h2"))
				.getText();
	}

	public void addLocation() {
		driver.findElement(By.xpath("//a[@href='location.form']")).click();
	}

	public void deleteLocation(String location) {
		WebElement link = driver.findElement(By.linkText("TestLocation"));
		String href = link.getAttribute("href");
		String id;
		try {
			id = new QueryParser(new URI(href).getQuery())
					.getParameter("locationId");
			driver.findElement(
					By.xpath("//input[@name='locationId' and @value='" + id
							+ "']")).click();
			driver.findElement(By.name("action")).click();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}

}
