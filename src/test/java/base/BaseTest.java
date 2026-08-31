package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {

        System.out.println("========== SETUP START ==========");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.saucedemo.com/");

        System.out.println("Browser Opened");
        System.out.println("Application Opened");
    }

    @AfterMethod
    public void tearDown() {

        System.out.println("Closing Browser");

        if (driver != null) {
            driver.quit();
        }

        System.out.println("========== TEST FINISHED ==========");
    }
}