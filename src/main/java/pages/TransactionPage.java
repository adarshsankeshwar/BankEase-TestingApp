package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransactionPage {

    private WebDriver driver;

    private By productName =
            By.className("inventory_item_name");

    private By checkoutButton =
            By.id("checkout");

    public TransactionPage(WebDriver driver) {

        this.driver = driver;
    }

    public String getTransactionProduct() {

        return driver.findElement(productName)
                .getText();
    }

    public void proceedToCheckout() {

        driver.findElement(checkoutButton)
                .click();
    }
}