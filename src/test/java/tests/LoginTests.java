package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import base.BaseTest;
import listeners.TestListener;
import pages.DashboardPage;
import pages.LoginPage;
import utilities.TestData;

@Listeners(TestListener.class)
public class LoginTests extends BaseTest {

    public WebDriver getDriver() {
        return driver;
    }

    @Test
    public void validLoginTest() {

        LoginPage loginPage =
                new LoginPage(driver);

        DashboardPage dashboardPage =
                new DashboardPage(driver);

        loginPage.login(
                TestData.VALID_USERNAME,
                TestData.VALID_PASSWORD
        );

        String actualTitle =
                dashboardPage.getPageTitle();

        Assert.assertEquals(
                actualTitle,
                "Products"
        );
    }

    @Test
    public void invalidLoginTest() {

        LoginPage loginPage =
                new LoginPage(driver);

        loginPage.login(
                TestData.INVALID_USERNAME,
                TestData.INVALID_PASSWORD
        );

        String error =
                loginPage.getErrorMessage();

        Assert.assertTrue(
                error.contains(
                        "Username and password do not match"
                )
        );
    }
}