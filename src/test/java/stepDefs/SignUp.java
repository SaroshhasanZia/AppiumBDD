package stepDefs;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static objects.SignUp.*;

public class SignUp {

    @ParameterType(".*")
    public String type(String inputQuery) {
        return inputQuery;
    }


    @And("^User clicks on SignUp Button$")
    public void UserClicksOnSignUpButton(){
        clickOnSignUp();

    }

    @When("User enter valid {type} and {type} and {type}")
    public void userEnterValidEmailAndPassword(String email, String password, String nickName) {
        fillSignUpForm(email,password,nickName);
    }

    @Then("User is navigated to email verification page")
    public void userIsNavigatedToEmailVerificationPage() {
        verificationPage();
    }

    @And("User clicks on registration button")
    public void userClicksOnRegistrationButton() {
        clickOnRegisterBtn();
    }
}
