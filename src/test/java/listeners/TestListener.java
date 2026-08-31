package listeners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utilities.ScreenshotUtil;

public class TestListener
        implements ITestListener {

    @Override
    public void onTestStart(
            ITestResult result) {

        System.out.println(
                "STARTING TEST: "
                + result.getName()
        );
    }

    @Override
    public void onTestSuccess(
            ITestResult result) {

        System.out.println(
                "TEST PASSED: "
                + result.getName()
        );
    }

    @Override
    public void onTestFailure(
            ITestResult result) {

        System.out.println(
                "TEST FAILED: "
                + result.getName()
        );

        Object testClass =
                result.getInstance();

        if (testClass instanceof
                tests.LoginTests) {

            WebDriver driver =
                    ((tests.LoginTests) testClass)
                            .getDriver();

            ScreenshotUtil.takeScreenshot(
                    driver,
                    result.getName()
            );
        }
    }
}