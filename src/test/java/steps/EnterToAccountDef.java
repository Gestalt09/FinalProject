package steps;

import cucumber.api.java.en.And;
import models.UserModel;
import pages.EnterToAccountPage;

public class EnterToAccountDef  {
    EnterToAccountPage enterToAccountPage= new EnterToAccountPage();

    @And("Input email")
    public void inputEmail() { enterToAccountPage.enterEmail(UserModel.email);}

    @And("Click continue button")
    public void clickContinueButton() { enterToAccountPage.pressContinueButton();}
}
