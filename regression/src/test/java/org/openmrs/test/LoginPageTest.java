package org.openmrs.test;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openmrs.page.HomePage;
import org.openmrs.page.LoginPage;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPageTest {

	private FirefoxDriver driver;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
	}

	@After
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
