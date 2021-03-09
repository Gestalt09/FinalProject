package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class BrandPage  {

    private SelenideElement iframe = $(By.id("mt-85722e86e2506dfe"));
    private SelenideElement blackPopUp =$(By.xpath("//div[@class='close-button-slider desktop']"));
    private SelenideElement popUp =$(By.xpath("//a[@class='c-button-inverse']"));
    private SelenideElement brandButton = $(By.xpath("//a[@class='ks-filter-link']//span[contains(text(),'Gigabyte')]"));
    private SelenideElement filterButton = $(By.xpath("//div[@class='ks-sort-select-wrap']"));
    private SelenideElement maxPrice =$(By.xpath("//li[@class='select2-results__option']"));
    private SelenideElement product =$(By.xpath("//a[@data-gtm-link='411676']"));



    public void clickOnBlackPopUp(){
        switchTo().frame(this.iframe);
        this.blackPopUp.click();
    }
    public void clickOnPopUp(){this.popUp.click();}
    public void chooseBrand(){this.brandButton.click();}
    public void clickOnFilterButton(){this.filterButton.click();}
    public void chooseMaxPrice(){this.maxPrice.click();}
    public void clickOnProduct(){this.product.click();}
}
