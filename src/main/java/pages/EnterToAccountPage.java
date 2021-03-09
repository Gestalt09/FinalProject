package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class EnterToAccountPage {
    private SelenideElement emailBar = $(By.xpath("//form[@id='new_user_guest']//input[@class='users-session-form__input users-session-form__input--text']"));
    private SelenideElement ContinueButton = $(By.xpath("//form[@id='new_user_guest']//input[@class='users-session-form__submit']"));

    public void enterEmail(String email){ this.emailBar.setValue(email); }
    public void pressContinueButton(){this.ContinueButton.click();}

}

