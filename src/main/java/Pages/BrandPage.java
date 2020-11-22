package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BrandPage  {

    private SelenideElement popUp =$(By.xpath("//a[@class='c-button-inverse']"));
    private SelenideElement brandButton = $(By.xpath("//a[@class='filter-link']//span[contains(text(),'Gigabyte')]"));
    private SelenideElement filterButton = $(By.xpath("//div[@class='sort-select-wrap']"));
    private SelenideElement maxPrice =$(By.xpath("//li[@class='select2-results__option']"));
    private SelenideElement product =$(By.xpath("//div[@class='sn-docs js-product-container product-grid-row']//div[4][@class='new-product-item catalog-taxons-product']//div[@class='gtm-categories new-product-hover']"));



    public void clickOnPopUp(){this.popUp.click();}
    public void chooseBrand(){this.brandButton.click();}
    public void clickOnFilterButton(){this.filterButton.click();}
    public void chooseMaxPrice(){this.maxPrice.click();}
    public void clickOnProduct(){this.product.click();}
}
