package steps;

import cucumber.api.java.en.And;
import pages.CheckOutPage;

public class CheckOutStepDef {
    CheckOutPage checkOutPage = new CheckOutPage();


    @And("Click check out")
    public void clickCheckOut() { checkOutPage.clickCheckOutButton(); }


}
