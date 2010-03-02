package org.openmrs.page;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private class QueryParser {
		private Map<String, String> queryMap;

		public QueryParser(String query) {
			queryMap = getQueryMap(query);
		}

		public String getParameter(String name) {
			return queryMap.get(name);
		}

		private Map<String, String> getQueryMap(String query) {
			String[] params = query.split("&");
			Map<String, String> map = new HashMap<String, String>();
			for (String param : params) {
				String name = param.split("=")[0];
				String value = param.split("=")[1];
				map.put(name, value);
			}
			return map;
		}
	}
}
