package objects;

import org.junit.Assert;
import org.openqa.selenium.By;

import static general.CommonFunctions.*;

public class Login {

    public static By loginBtn = By.id("com.sand.airdroid:id/tvLogin");

    public static By emailField = By.xpath("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.EditText");
    public static By passField = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.EditText");
    public static By signInBtn = By.id("com.sand.airdroid:id/btnLogin");
    public static By invalidEmailMsg = By.id("com.sand.airdroid:id/description");
    public static By signInError = By.id("com.sand.airdroid:id/tvMessage");
    public static By homePageText = By.id("com.sand.airdroid:id/tvUserName");
    public static By permissionAccept =  By.id("com.sand.airdroid:id/tvIKnow");
    public static By permissionAllow = By.id("com.android.permissioncontroller:id/permission_allow_button");
    public static By securityFeatureOk = By.id("com.sand.airdroid:id/tvOk");
    public static By backNavigation = By.id("com.sand.airdroid:id/tvArrow");

    public static By profileSection = By.id("com.sand.airdroid:id/itemUserCenter");

    public static void AppInstalledSuccessfully() {
        Assert.assertTrue("App Installed",checkAppInstalled("com.sand.airdroid"));
    }

    public static void lauchApp(){

        if(checkAppInstalled("com.sand.airdroid")) {
        openApp("com.sand.airdroid");}
        else {
            System.out.println("App Not Installed");
        }
    }

    public static void clickLoginBtn(){
        clickFunction(loginBtn);
    }

    public static void enterEmailPassword(String username, String password){
        sendKeysFunction(emailField,username);
        sendKeysFunction(passField,password);
    }
    public static void clickSignIn(){
        clickFunction(signInBtn);
    }

    public static void emailErrorMsg(){

        textAssertion("Failed to sign in. Email or password is incorrect. (-10001)",signInError);
    }

    public static void homeAssertion(){
        clickFunction(permissionAccept);
        clickFunction(permissionAllow);
        clickFunction(securityFeatureOk);
        clickFunction(backNavigation);
        textAssertion("tester",homePageText);
    }


    public static void clickOnProfile(){
        clickFunction(profileSection);
    }

    public static void scrollToSignOut(){
        scrollToElement("Sign out");
    }

}
