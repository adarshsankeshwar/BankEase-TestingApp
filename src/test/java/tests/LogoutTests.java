package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.LogoutPage;
import utilities.TestData;

public class LogoutTests extends BaseTest {

    @Test
    public void logoutTest() {

        LoginPage loginPage =
                new LoginPage(driver);

        LogoutPage logoutPage =
                new LogoutPage(driver);

        loginPage.login(
                TestData.VALID_USERNAME,
                TestData.VALID_PASSWORD
        );

        logoutPage.logout();

        String currentUrl =
                driver.getCurrentUrl();

        Assert.assertTrue(
                currentUrl.contains("saucedemo.com")
        );

        Assert.assertTrue(
                driver.findElement(
                        org.openqa.selenium.By.id("login-button")
                ).isDisplayed()
        );
    }
}