package org.openmrs.test.page.home;

import org.openmrs.test.page.FormPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends FormPage {

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void setPassword(String password) {
		enterText("pw", password);
	}

	public void setUser(String user) {
		enterText("uname", user);
	}

	public void submit() {
		driver.findElement(By
				.xpath("//input[@type='submit' and @value='Log In']")).click();
	}

	protected String getPath() {
		return "login.htm";
	}
}
