package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.TransferPage;
import utilities.TestData;

public class TransferTests extends BaseTest {

    @Test
    public void addProductAsTransferSimulation() {

        LoginPage loginPage =
                new LoginPage(driver);

        TransferPage transferPage =
                new TransferPage(driver);

        loginPage.login(
                TestData.VALID_USERNAME,
                TestData.VALID_PASSWORD
        );

        transferPage.performTransfer();

        String cartCount =
                driver.findElement(
                        org.openqa.selenium.By
                                .className(
                                        "shopping_cart_badge"
                                )
                ).getText();

        Assert.assertEquals(
                cartCount,
                "1"
        );
    }
}