package org.openmrs.test;


import org.openmrs.User;
import org.openmrs.page.HomePage;
import org.openmrs.page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest {

	private WebDriver driver;

	@BeforeSuite
	public void initializeDriver() throws Exception {
		WebDriverFactory.setCurrentDriver(new FirefoxDriver());
	}

	@BeforeTest
	public void setTheDriver() throws Exception {
		driver = WebDriverFactory.getCurrentDriver();
	}

	@AfterSuite
	public void closeTheDriver() throws Exception {
		WebDriverFactory.closeCurrentDriver();
	}

	@Test
	public void shouldLoginForAValidUser() {
		User user = new User();
		LoginPage loginPage = new LoginPage(driver);
		loginPage.open();
		loginPage.setUser(user.getUsername());
		loginPage.setPassword(user.getPassword());
		loginPage.submit();

		HomePage homePage = new HomePage(driver);
		Assert.assertEquals("OpenMRS - Home", homePage.getTitle());
	}
}
