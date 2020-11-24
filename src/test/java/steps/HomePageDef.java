package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.ProductModel;
import pages.HomePage;

import static com.codeborne.selenide.Selenide.open;

public class HomePageDef  {


    HomePage homepage = new HomePage();


    @Given("Open Chrome browser")
    public void openChromeBrowser() {

    }

    @When("^I Open (.*)$")
    public void iOpenHttpsWwwALv(String url) { open(url);}


    @Then("Enter product")
    public void enterProduct() {
        homepage.inputProductName(ProductModel.product);
    }

    @And("Press {string} button")
    public void pressButton(String Search) { homepage.pressSearchButton();

    }



}
