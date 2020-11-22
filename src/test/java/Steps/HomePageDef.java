package Steps;

import Helpers.Hooks;
import Models.UserModel;
import Pages.HomePage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageDef extends Hooks {
    @Before
     public void intialisation(){
        start();
    }

    @After
    public void teardown(){
        finish();
    }

    HomePage homepage = new HomePage();


    @Given("Open Chrome browser")
    public void openChromeBrowser() {

    }

    @When("^I Open (.*)$")
    public void iOpenHttpsWwwALv(String url) {
    }


    @Then("Enter product")
    public void enterProduct() {
        homepage.inputProductName(UserModel.product);
    }

    @And("Press {string} button")
    public void pressButton(String Search) { homepage.pressSearchButton();

    }



}
