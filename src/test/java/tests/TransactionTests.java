package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.TransactionPage;
import pages.TransferPage;
import utilities.TestData;

public class TransactionTests extends BaseTest {

    @Test
    public void verifyTransactionProduct() {

        LoginPage loginPage =
                new LoginPage(driver);

        TransferPage transferPage =
                new TransferPage(driver);

        TransactionPage transactionPage =
                new TransactionPage(driver);

        loginPage.login(
                TestData.VALID_USERNAME,
                TestData.VALID_PASSWORD
        );

        transferPage.performTransfer();

        transferPage.openTransactionSummary();

        String product =
                transactionPage.getTransactionProduct();

        Assert.assertEquals(
                product,
                "Sauce Labs Backpack"
        );
    }
}