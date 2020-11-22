package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProductPage {
    private SelenideElement buyButton = $(By.id("add_to_cart_btn"));
    private SelenideElement cartButton = $(By.xpath("//a[@class='main-button']"));

    public void clickAddToCart() { this.buyButton.click();}
    public void clickGoToCart(){this.cartButton.click();}

}
