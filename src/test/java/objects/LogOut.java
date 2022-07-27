package objects;

import org.junit.Assert;
import org.openqa.selenium.By;

import static general.CommonFunctions.*;
import static general.MobileDriver.getDriver;
import static java.lang.Thread.sleep;

public class LogOut {

    public static By profile = By.id("com.sand.airdroid:id/itemUserCenter");

    public static By signOutBtn = By.id("com.sand.airdroid:id/tvLogout");

    public static By passwordRequired = By.id("com.sand.airdroid:id/content");
    public static By okBtn = By.id("com.sand.airdroid:id/tvOK");
    public static By wrongPassword = By.id("com.sand.airdroid:id/tvResult");
    public static By lognPage = By.id("com.sand.airdroid:id/textView3");

    public static void clickOnProfile() {
        clickFunction(profile);
    }

    public static void scrollToSignOutBtn() throws InterruptedException {
        verticalScroll();
        sleep(2000);
        clickFunction(signOutBtn);
    }

    public static void enterPassword(String password) {
        sendKeysFunction(passwordRequired, password);
        clickFunction(okBtn);
    }

    public static void validAssertion() {

        String signedIn = "Sign in with";


        try {
            String text = getDriver().findElement(lognPage).getText();
            Assert.assertTrue(text.equalsIgnoreCase(signedIn));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    public static void invalidAssertion() {

        String incorrectPwd = "Password is incorrect";


        try {
            String text = getDriver().findElement(wrongPassword).getText();
            Assert.assertTrue(text.equalsIgnoreCase(incorrectPwd));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }


}
