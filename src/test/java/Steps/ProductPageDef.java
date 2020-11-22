package Steps;

import Helpers.Hooks;
import Pages.ProductPage;
import cucumber.api.java.en.And;

public class ProductPageDef extends Hooks {
    ProductPage productPage = new ProductPage();

    @And("Click add to cart")
    public void clickAddToCart() {productPage.clickAddToCart();}

    @And("Click go to the cart")
    public void clickGoToTheCart() { productPage.clickGoToCart();}
}
