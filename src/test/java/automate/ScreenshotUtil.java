package automate;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.appium.java_client.AppiumDriver;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtil {

    private static AppiumDriver driver;

    // Method to set the driver instance
    public static void setDriver(AppiumDriver driver) {
        ScreenshotUtil.driver = driver;
    }

    // Capture screenshot with module-wise storage
    public static void captureScreenshot(String moduleName, String stepName) {
        if (driver == null) {
            System.out.println("Driver is not set in ScreenshotUtil!");
            return;
        }

        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String folderPath = "screenshots/" + moduleName; // Store each module separately
        String fileName = stepName + "_" + timestamp + ".png";

        try {
            File folder = new File(folderPath);
            if (!folder.exists()) {
                folder.mkdirs(); // Create directories
            }

            // Properly cast driver to TakesScreenshot
            File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File destFile = new File(folderPath + "/" + fileName);
            FileUtils.copyFile(srcFile, destFile);

            System.out.println("Screenshot saved at: " + destFile.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Failed to save screenshot: " + e.getMessage());
        }
    }
}
