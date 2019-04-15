package Base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vchmel\\programs\\WebDriverChrome73\\chromedriver.exe");
        //Configuration.headless = true;
        Configuration.baseUrl = "https://www.newsmanagers.com/";
        System.setProperty("chromeoptions.args", "--disable-gpu");
        System.setProperty("chromeoptions.args", "--no-sandbox");
//        Configuration.startMaximized = true;
//        Configuration.holdBrowserOpen = true;
        Selenide.clearBrowserCookies();
    }

//    @AfterMethod
//            public void logOff(){
//        Selenide.clearBrowserCookies();
//        Selenide.clearBrowserLocalStorage();

    @BeforeMethod
    public void logOff() {
        Selenide.clearBrowserCookies();
    }
}
