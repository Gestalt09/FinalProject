package steps;

import com.codeborne.selenide.Configuration;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.ProductModel;
import pages.HomePage;

import static com.codeborne.selenide.Selenide.open;

public class HomePageStepDef {


    HomePage homepage = new HomePage();

    @Before
    public void setUp(){
        Configuration.startMaximized =true;
    }


    @Given("^I Open (.*)$")
    public void iOpenHttpsWwwALv(String url) { open(url);}


    @When("Enter product")
    public void enterProduct() {
        homepage.inputProductName(ProductModel.product);
    }

    @Then("Press {string} button")
    public void pressButton(String Search) { homepage.pressSearchButton();

    }



}
