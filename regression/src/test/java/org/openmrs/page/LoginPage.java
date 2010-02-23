package org.openmrs.page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends FormPage {

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void setPassword(String password) {
		enterText("password", password);
	}

	public void setUser(String user) {
		enterText("username", user);
	}

	public void submit() {
		WebElement logIn = driver.findElement(By.xpath("//input[@type='submit' and @value='Log In']"));
		logIn.click();
	}

	protected String getPath() {
		return "/login.htm";
	}
}
