package objects;

import org.openqa.selenium.By;

import static general.CommonFunctions.*;

public class SignUp {

    public static By signUpBtn = By.id("com.sand.airdroid:id/tvRegister");
    public static By emailTextField = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.EditText");
    public static By passwordField = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.EditText");
    public static By confirmPassField = By.xpath("\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[3]/android.widget.LinearLayout/android.widget.EditText");
    public static By nickNameField = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[4]/android.widget.LinearLayout/android.widget.EditText");
    public static By registerBtn = By.id("com.sand.airdroid:id/btnRegister");

    public static By verificationPage = By.xpath("\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ViewFlipper/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]");


    public static void clickOnSignUp() {
        clickFunction(signUpBtn);
    }


    public static void fillSignUpForm(String email, String password, String nickName) {
        sendKeysFunction(emailTextField, email);
        sendKeysFunction(passwordField, password);
        sendKeysFunction(confirmPassField, password);
        sendKeysFunction(nickNameField, nickName);
    }

    public static void clickOnRegisterBtn() {
        clickFunction(registerBtn);
    }

    public static void verificationPage() {
        textAssertion("Verify email", verificationPage);
    }

}
