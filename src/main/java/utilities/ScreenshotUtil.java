package utilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {

    public static String takeScreenshot(
            WebDriver driver,
            String testName) {

        try {

            TakesScreenshot screenshot =
                    (TakesScreenshot) driver;

            File source =
                    screenshot.getScreenshotAs(
                            OutputType.FILE
                    );

            File folder =
                    new File("screenshots");

            if (!folder.exists()) {
                folder.mkdirs();
            }

            File destination =
                    new File(
                            folder,
                            testName + ".png"
                    );

            Files.copy(
                    source.toPath(),
                    destination.toPath()
            );

            return destination.getAbsolutePath();

        } catch (IOException e) {

            e.printStackTrace();

            return null;
        }
    }
}