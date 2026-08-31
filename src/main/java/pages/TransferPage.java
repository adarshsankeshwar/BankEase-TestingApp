package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransferPage {

    private WebDriver driver;

    private By backpackButton =
            By.id("add-to-cart-sauce-labs-backpack");

    private By cartButton =
            By.className("shopping_cart_link");

    public TransferPage(WebDriver driver) {

        this.driver = driver;
    }

    public void performTransfer() {

        driver.findElement(backpackButton)
                .click();
    }

    public void openTransactionSummary() {

        driver.findElement(cartButton)
                .click();
    }
}