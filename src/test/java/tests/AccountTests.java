package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.AccountPage;
import pages.LoginPage;
import utilities.TestData;

public class AccountTests extends BaseTest {

    @Test
    public void verifyProductInformation() {

        LoginPage loginPage =
                new LoginPage(driver);

        AccountPage accountPage =
                new AccountPage(driver);

        loginPage.login(
                TestData.VALID_USERNAME,
                TestData.VALID_PASSWORD
        );

        Assert.assertTrue(
                accountPage.isProductDisplayed()
        );

        System.out.println(
                "Product: "
                + accountPage.getProductName()
        );

        System.out.println(
                "Price: "
                + accountPage.getProductPrice()
        );
    }
}