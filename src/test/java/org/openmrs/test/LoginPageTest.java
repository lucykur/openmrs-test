package org.openmrs.test;

import com.yourkit.api.Controller;
import com.yourkit.api.ProfilingModes;
import org.openmrs.test.page.Page;
import org.openmrs.test.page.home.HomePage;
import org.openmrs.test.page.home.LoginPage;
import org.openmrs.test.parameter.Driver;
import org.openmrs.test.parameter.Host;
import org.openmrs.test.parameter.Profiling;
import org.openmrs.test.parameter.User;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest {

    private WebDriver driver;
    private Controller controller;
    private Profiling profiling;

    @BeforeSuite(groups = {"smoke", "regression"})
    public void initializeDriver() throws Exception {

        WebDriverFactory.setCurrentDriver((WebDriver) Class.forName(
                new Driver().getClazz()).newInstance());
        profiling = new Profiling();
        if (profiling.isEnabled()) {

            new Controller(new Host().getAddress(), profiling.getPort()).startCPUProfiling(ProfilingModes.CPU_SAMPLING, "");
        }
    }

    @BeforeTest(groups = {"smoke", "regression"})
    public void setTheDriver() throws Exception {
        driver = WebDriverFactory.getCurrentDriver();
    }

    @AfterSuite(groups = {"smoke", "regression"})
    public void closeTheDriver() throws Exception {
        if (profiling.isEnabled()) {

            controller = new Controller("localhost", 10001);
            controller.captureMemorySnapshot();
            controller.stopCPUProfiling();
        }
        WebDriverFactory.closeCurrentDriver();

    }

    @Test(groups = {"smoke", "regression"})
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
