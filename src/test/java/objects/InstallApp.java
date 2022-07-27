package objects;

import org.junit.Assert;
import org.openqa.selenium.By;

import static general.CommonFunctions.*;
import static java.lang.Thread.sleep;

public class InstallApp {

    public static By playstoreButton = By.xpath("//android.widget.TextView[@content-desc=\"Play Store\"]");
    public static By searchBox = By.xpath("\t\n" + "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[1]/android.view.View");
    public static By textBox = By.xpath("\t\n" + "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.EditText");
    public static By selectOption = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]");
    public static By installButn = By.xpath("//android.widget.Button[@content-desc=\"Install\"]");
    public static By installed = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.widget.TextView[2]");
    public static void openPlayStore() {
        clickFunction(playstoreButton);

    }

    public static void searchForAirdroid() {
        clickFunction(searchBox);
        sendKeysFunction(textBox, "airdroid");
    }

    public static void installApp() {
        clickFunction(selectOption);
        clickFunction(installButn);
    }

    public static void installedAssertion() throws InterruptedException {
//        textAssertion("Pending…",installed);
        Assert.assertTrue("App isntalled",checkAppInstalled("com.sand.airdroid"));
        
    }
}
