package LoginForm.UserCanLogin;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class UserProfilePage {

    SelenideElement userProfileLink = $("a[href='/fr/user']");


    public void checkLoggedUserName(String expUserName){

        userProfileLink.shouldHave(Condition.text(expUserName));
    }
}
