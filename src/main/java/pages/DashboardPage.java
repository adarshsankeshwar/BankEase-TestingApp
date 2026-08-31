package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

    private WebDriver driver;

    private By pageTitle =
            By.className("title");

    private By menuButton =
            By.id("react-burger-menu-btn");

    private By logoutButton =
            By.id("logout_sidebar_link");

    public DashboardPage(WebDriver driver) {

        this.driver = driver;
    }

    public String getPageTitle() {

        return driver.findElement(pageTitle)
                .getText();
    }

    public void openMenu() {

        driver.findElement(menuButton)
                .click();
    }

    public void logout() {

        openMenu();

        driver.findElement(logoutButton)
                .click();
    }
}