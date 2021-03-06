package steps;

import cucumber.api.java.en.And;
import models.UserModel;
import pages.ShippingPage;

public class ShippingPageStepDef {
    ShippingPage shippingPage = new ShippingPage();

    @And("Click get in office")
    public void clickGetInOffice() {shippingPage.clickGetInOffice();}

    @And("Click on first shop")
    public void clickOnFirstShop() { shippingPage.clickOnFirstShopButton();}

    @And("input user data")
    public void inputUserData() { shippingPage.enterUserData(UserModel.name,UserModel.surname,UserModel.phone);}

    @And("Click continue button again")
    public void clickContinueButtonAgain() { shippingPage.clickContinueButtonAtShippingStage();}


    @And("Click continue button seconde time")
    public void clickContinueButtonSecondeTime() { shippingPage.clickContinueButtonAtShippingStageAgain();}
}
