package org.openmrs.test;

import junit.framework.Assert;

import org.openmrs.page.HomePage;
import org.openmrs.page.LoginPage;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest {

	private FirefoxDriver driver;

        @BeforeTest
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
	}

	@AfterTest
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test
	public void shouldLoginForAValidUser()  {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.open();
		loginPage.setUser("admin");
		loginPage.setPassword("Openmr5tw");
		loginPage.submit();

		HomePage homePage = new HomePage(driver);
		Assert.assertEquals("OpenMRS - Home", homePage.getTitle());
	}
}
