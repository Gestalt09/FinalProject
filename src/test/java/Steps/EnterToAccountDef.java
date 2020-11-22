package Steps;

import Models.UserModel;
import Pages.EnterToAccountPage;
import cucumber.api.java.en.And;

public class EnterToAccountDef {
    EnterToAccountPage enterToAccountPage= new EnterToAccountPage();

    @And("Input email")
    public void inputEmail() { enterToAccountPage.enterEmail(UserModel.email);}

    @And("Click continue button")
    public void clickContinueButton() { enterToAccountPage.pressContinueButton();}
}
