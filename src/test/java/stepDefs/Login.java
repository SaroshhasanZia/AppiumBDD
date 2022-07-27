package stepDefs;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import tests.TestRunner;

import static objects.Login.*;


public class Login {

    @ParameterType(".*")
    public String query(String inputQuery) {
        return inputQuery;
    }


    @Given("The App Is Installed Successfully")
            public void TheAppIsInstalledSuccessfully()
    {      lauchApp();

    }


    @And("User is on Main activity i.e login page")
    public void userIsOnMainActivityIELoginPage() {
        clickLoginBtn();

    }



    @And("User press login button")
    public void userPressLoginButton() {
        clickSignIn();
    }

    @Then("User see error msg of invalid credentials")
    public void userSeeErrorMsgOfInvalidCredentials() {
         emailErrorMsg();
    }

    @And("User is on Main activity i.e login page and clicks SignIn button")
    public void userIsOnMainActivityIELoginPageAndClicksSignInButton() {
        clickLoginBtn();

    }

    @When("User enter invalid {query} and {query}")
    public void userEnterInvalidUserNameAndPassword(String email, String password) {
        enterEmailPassword(email,password);
    }


    @Then("User navigates to home page")
    public void userNavigatesToHomePage() {
        homeAssertion();
    }
}
