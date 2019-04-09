package Base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/home/kondratievas/Загрузки/chromedriver");
        Configuration.headless = true;
        Configuration.baseUrl = "https://www.newsmanagers.com/";
        System.setProperty("chromeoptions.args", "--disable-gpu");
        System.setProperty("chromeoptions.args", "--no-sandbox");
//        Configuration.startMaximized = true;
////        Configuration.holdBrowserOpen = true;

        Selenide.clearBrowserCookies(); //to clear login

    }

    @AfterMethod
            public void logOff(){
        Selenide.clearBrowserCookies();
//        Selenide.clearBrowserLocalStorage();

    }

}