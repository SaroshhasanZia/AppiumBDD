package stepDefs;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static objects.InstallApp.*;

public class InstallApp {


    @Given("User clicks on the playStore App")
    public void userClicksOnThePlayStoreApp() {
        openPlayStore();
    }

    @When("User search for Airdroid")
    public void userSearchForAirdroid() {
        searchForAirdroid();
    }

    @And("User selects the App and click install")
    public void userSelectsTheAppAndClickInstall() {
        objects.InstallApp.installApp();
    }

    @Then("user can view the App status as installed")
    public void userCanViewTheAppStatusAsInstalled() throws InterruptedException {installedAssertion();}

}
