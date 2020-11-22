package helpers;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import static com.codeborne.selenide.Selenide.open;


public class Hooks {
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gestalt\\IdeaProjects\\FinalProject\\src\\test\\resources\\chromedriver.exe");
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        open ("https://www.1a.lv/");
    }

    @After
    public void closeUrl(){
        Selenide.closeWebDriver();}
}


