package LoginForm.Errors;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/home/kondratievas/Загрузки/chromedriver");

        Configuration.baseUrl = "http://review-master-uifm4p.ra.skilld.cloud";
        Configuration.startMaximized = true;
        Configuration.holdBrowserOpen = true;

        Selenide.clearBrowserCookies(); //to clear login
    }
}