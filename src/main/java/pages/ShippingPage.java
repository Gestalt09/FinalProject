package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ShippingPage {

    private SelenideElement getInOfficeButton = $(By.xpath("//input[@value='2']"));
    private SelenideElement firstShopButton = $(By.xpath("//input[@value='3210']"));
    private SelenideElement usernameBar = $(By.xpath("//input[@name='address[first_name]']"));
    private SelenideElement surnameBar = $(By.xpath("//input[@name='address[last_name]']"));
    private SelenideElement phoneNumberbar = $(By.xpath("//input[@name='address[phone_number]']"));
    private SelenideElement continueButtonAtShipping = $(By.xpath("//button[@class='main-button upcase fr small-radius button-min-width checkout-shipping-continue-button']"));

    public void clickGetInOffice(){this.getInOfficeButton.click();}
    public void clickOnFirstShopButton(){this.firstShopButton.click();}
    public void enterUserData(String name,String surname,String phone){
        this.usernameBar.setValue(name);
        this.surnameBar.setValue(surname);
        this.phoneNumberbar.setValue(phone);
    }
    public void clickContinueButtonAtShippingStage(){this.continueButtonAtShipping.click();}
    public void clickContinueButtonAtShippingStageAgain(){this.continueButtonAtShipping.click();}


}
