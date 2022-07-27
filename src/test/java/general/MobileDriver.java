package general;

import com.testinium.deviceinformation.exception.DeviceNotFoundException;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class MobileDriver {

    public static AppiumDriver<MobileElement> driver;


    public static AppiumDriver<MobileElement> getDriver() {
        if (driver != null) {
            return driver;
        } else {
            throw new IllegalStateException("Driver has not been initialized");
        }
    }


    public static AppiumDriver startDriver() throws DeviceNotFoundException, IOException {
        driver = new AppiumDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), DesiredCapabilitiesGenerator.capabilities());

        driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
        return driver;
    }


    public static void finishDriver() throws IOException {
        if (driver != null)
        {
            driver.quit();
            driver = null;
        }
    }

}
