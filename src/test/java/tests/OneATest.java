package tests;

import models.ProductModel;
import models.UserModel;
import org.junit.Test;
import pages.*;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;


public class OneATest  {
    @Test
    public void firstTest() {
        baseUrl = "https://www.1a.lv/";
        holdBrowserOpen = true;
        startMaximized = true;
        open("https://www.1a.lv/");
        HomePage homepage = new HomePage();
        BrandPage brandpage = new BrandPage();
        ProductPage productPage = new ProductPage();
        CheckOutPage checkOutPage = new CheckOutPage();
        EnterToAccountPage enterToAccountPage = new EnterToAccountPage();
        ShippingPage shippingPage = new ShippingPage();





        homepage.inputProductName(ProductModel.product);
        homepage.pressSearchButton();
        brandpage.clickOnPopUp();
        brandpage.chooseBrand();
        brandpage.clickOnFilterButton();
        brandpage.chooseMaxPrice();
        brandpage.clickOnProduct();
        productPage.clickAddToCart();
        sleep(2000);
        productPage.clickGoToCart();
        checkOutPage.clickCheckOutButton();
        enterToAccountPage.enterEmail(UserModel.email);
        enterToAccountPage.pressContinueButton();
        shippingPage.clickGetInOffice();
        shippingPage.clickOnFirstShopButton();
        shippingPage.enterUserData(UserModel.name,UserModel.surname,UserModel.phone);
        sleep(2000);
        shippingPage.clickContinueButtonAtShippingStage();



    }
}
