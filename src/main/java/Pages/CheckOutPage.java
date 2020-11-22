package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CheckOutPage {

    private SelenideElement checkOutButton= $(By.xpath("//input[@class='main-button cart-main-button cart-main-button--large']"));

    public void clickCheckOutButton(){this.checkOutButton.click();}
}
