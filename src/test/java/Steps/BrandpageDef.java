package Steps;

import Helpers.Hooks;
import Pages.BrandPage;
import cucumber.api.java.en.And;

public class BrandpageDef extends Hooks {



    BrandPage brandpage = new BrandPage();


    @And("^Click on pop-up$")
    public void clickOnPopUp() {
        brandpage.clickOnPopUp();
    }

    @And("^Choose brand$")
    public void chooseBrand() {
        brandpage.chooseBrand();
    }

    @And("Click on filter Button")
    public void clickOnFilterButton() { brandpage.clickOnFilterButton();
    }

    @And("Filter start from max price")
    public void filterStartFromMaxPrice() {brandpage.chooseMaxPrice();}

    @And("Click on product")
    public void clickOnProduct() { brandpage.clickOnProduct();}
}
