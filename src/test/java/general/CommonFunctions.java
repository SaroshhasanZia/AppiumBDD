package general;

import com.testinium.deviceinformation.exception.DeviceNotFoundException;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import static general.MobileDriver.*;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofMillis;

public class CommonFunctions {

    //    static Duration time = Duration.ofSeconds(9);
    public static WebDriverWait wait = new WebDriverWait(getDriver(), 9);


    public static void visibilityOfElementLocated(By locator) {
        new WebDriverWait(getDriver(), 9).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }


    public static void sendKeysFunction(By fieldLocator, String fieldText) {

        try {
            visibilityOfElementLocated(fieldLocator);
            getDriver().findElement(fieldLocator).clear();
            getDriver().findElement(fieldLocator).sendKeys(fieldText);

        } catch (Exception exp) {
            exp.printStackTrace();
        }


    }

    public static String getText(By locator) {

        String text = getDriver().findElement(locator).getText();
        return text;
    }

    public static void clickFunction(By clickElement) {
        try {
            visibilityOfElementLocated(clickElement);
            getDriver().findElement(clickElement).click();

        } catch (Exception exp) {
            exp.printStackTrace();
        }

    }

    public static void textAssertion(String actual, By locator) {

        try {
            visibilityOfElementLocated(locator);
            String text = getDriver().findElement(locator).getText();
            Assert.assertEquals(text, actual);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static String getString(By locator){
        String text = getDriver().findElement(locator).getText();
        return text;
    }

    public static boolean checkAppInstalled(String App) {
        return getDriver().isAppInstalled(App);
    }

    public static void openApp(String App) {
        driver.activateApp(App);
    }

    public static void closeApp(String App) {
        driver.terminateApp(App);


    }

    public static void scrollToElement(String elementText) {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"" + elementText + "\"));")).click();
    }

    public static void scrollAction(By locator){
        TouchAction action = new TouchAction(driver);
        WebElement ele = driver.findElement(locator);
        action.tap(new TapOptions().withElement(new ElementOption().withElement(ele))).perform();

//        action.scroll(driver.findElement(locator), 10, 100);
//        action.perform();


    }
    public static Date getTime() {
        Calendar calendar = Calendar.getInstance();
        return calendar.getTime();
    }

    public static void verticalScroll() {

        Dimension size = driver.manage().window().getSize();
        int y_start = (int) (size.height * 0.8);
        int y_end = (int) (size.height * 0.2);
        int x = size.width / 2;
        TouchAction action = new TouchAction(driver);
                action.press(PointOption.point(200,800))
                .waitAction(waitOptions(ofMillis(800)))
                .moveTo(PointOption.point(200,400))
                .release()
                .perform();



    }
}
