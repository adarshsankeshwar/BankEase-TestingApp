package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {

    private WebDriver driver;

    private By firstProduct =
            By.className("inventory_item");

    private By productName =
            By.className("inventory_item_name");

    private By productPrice =
            By.className("inventory_item_price");

    public AccountPage(WebDriver driver) {

        this.driver = driver;
    }

    public boolean isProductDisplayed() {

        return driver.findElement(firstProduct)
                .isDisplayed();
    }

    public String getProductName() {

        return driver.findElement(productName)
                .getText();
    }

    public String getProductPrice() {

        return driver.findElement(productPrice)
                .getText();
    }
}