package org.openmrs.test;

import org.openmrs.Driver;
import org.openmrs.User;
import org.openmrs.page.HomePage;
import org.openmrs.page.LoginPage;
import org.openmrs.page.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest {

	private WebDriver driver;

	@BeforeSuite(groups = { "smoke", "regression" })
	public void initializeDriver() throws Exception {
		WebDriverFactory.setCurrentDriver((WebDriver) Class.forName(
				new Driver().getClazz()).newInstance());
	}

	@BeforeTest(groups = { "smoke", "regression" })
	public void setTheDriver() throws Exception {
		driver = WebDriverFactory.getCurrentDriver();
	}

	@AfterSuite(groups = { "smoke", "regression" })
	public void closeTheDriver() throws Exception {
		WebDriverFactory.closeCurrentDriver();
	}

	@Test(groups = { "smoke", "regression" })
	public void shouldLoginForAValidUser() {
		User user = new User();
		LoginPage loginPage = new LoginPage(driver);
		loginPage.open();
		loginPage.setUser(user.getUsername());
		loginPage.setPassword(user.getPassword());
		loginPage.submit();

		Page homePage = new HomePage(driver);
		Assert.assertEquals("OpenMRS - Home", homePage.getTitle());
	}
}
