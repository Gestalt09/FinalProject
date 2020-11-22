package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    private SelenideElement searchBar = $(By.xpath("//input[@class='sn-suggest-input autocomplete main-search-input']"));
    private SelenideElement searchButton = $(By.xpath("//i[@class='main-search-submit__icon icon-svg']"));


    public void inputProductName(String product){
        this.searchBar.setValue(product);
    }
    public void pressSearchButton(){ this.searchButton.click(); }
}
