package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.DashboardPage;
import pages.LoginPage;
import utilities.TestData;

public class DashboardTests extends BaseTest {

    @Test
    public void verifyDashboardTitle() {

        LoginPage loginPage =
                new LoginPage(driver);

        DashboardPage dashboardPage =
                new DashboardPage(driver);

        loginPage.login(
                TestData.VALID_USERNAME,
                TestData.VALID_PASSWORD
        );

        String title =
                dashboardPage.getPageTitle();

        Assert.assertEquals(
                title,
                "Products"
        );
    }
}