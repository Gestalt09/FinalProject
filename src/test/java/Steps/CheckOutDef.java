package Steps;

import Helpers.Hooks;
import Pages.CheckOutPage;
import cucumber.api.java.en.And;

public class CheckOutDef extends Hooks {
    CheckOutPage checkOutPage = new CheckOutPage();


    @And("Click check out")
    public void clickCheckOut() { checkOutPage.clickCheckOutButton(); }


}
