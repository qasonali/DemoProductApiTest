package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {

    public static void captureScreenshot(WebDriver driver,
                                         String testName)
                                         throws IOException {

        TakesScreenshot ts =
                (TakesScreenshot) driver;

        File src = ts.getScreenshotAs(OutputType.FILE);

        File dest = new File(
            "./screenshots/" + testName + ".png"
        );

        FileUtils.copyFile(src, dest);

        System.out.println("Screenshot captured");
    }
}