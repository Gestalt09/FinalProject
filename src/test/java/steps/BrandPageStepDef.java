package steps;

import cucumber.api.java.en.And;
import pages.BrandPage;

public class BrandPageStepDef {



    BrandPage brandpage = new BrandPage();




    @And("^Click on pop up$")
    public void clickOnPopUp() {
        brandpage.clickOnPopUp();
    }
    @And("^Click on black pop up$")
    public void clickOnBlackPopUp() {
        brandpage.clickOnBlackPopUp();
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
