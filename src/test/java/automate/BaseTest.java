package automate;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;


public class BaseTest {
    protected static AppiumDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        if (driver == null) {
            UiAutomator2Options options = new UiAutomator2Options();
            options.setDeviceName("8c6988c");  // Replace with your actual device name
            options.setAppPackage("com.google.android.youtube");
            options.setAppActivity(".app.honeycomb.Shell$HomeActivity");
            options.setPlatformName("Android");
            options.setAutomationName("UIAutomator2");
           
            options.setNoReset(true);
            try {
            driver = new AppiumDriver(new URL("http://127.0.0.1:4723"), options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            ScreenshotUtil.setDriver(driver);  // Set driver for screenshot utility
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
