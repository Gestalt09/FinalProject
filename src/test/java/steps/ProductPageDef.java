package steps;

import cucumber.api.java.en.And;
import pages.ProductPage;

public class ProductPageDef  {
    ProductPage productPage = new ProductPage();

    @And("Click add to cart")
    public void clickAddToCart() {productPage.clickAddToCart();}

    @And("Click go to the cart")
    public void clickGoToTheCart() { productPage.clickGoToCart();}
}
