package NewsletterForm;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/home/kondratievas/Загрузки/chromedriver");

        Configuration.baseUrl = "https://www.newsmanagers.com/";
        Configuration.startMaximized = true;
//        Configuration.holdBrowserOpen = true;

        Selenide.clearBrowserCookies(); //to clear login

    }
}