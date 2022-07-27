package stepDefs;


import io.cucumber.java.ParameterType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static objects.LogOut.*;

public class LogOut {

    @ParameterType(".*")
    public String argQuery(String inputQuery) {

        return inputQuery;
    }


    @When("^User clicks on Profile section$")
    public void UserClicksOnProfileSecton() {
        clickOnProfile();

    }


    @And("User scroll to SignOut button and click")
    public void userScrollToSignOutButtonAndClick() throws InterruptedException {
        scrollToSignOutBtn();
    }

    @And("User enters {argQuery}")
    public void userEntersPassword(String password) {
        enterPassword(password);
    }

    @Then("User is signed out")
    public void userIsSignedOut() {
        validAssertion();    }

    @Then("User is not signed out")
    public void userIsNotSignedOut() {
        invalidAssertion();
    }
}
