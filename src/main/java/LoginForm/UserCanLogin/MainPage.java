package LoginForm.UserCanLogin;

import LoginForm.UserCanLogin.UserProfilePage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {




    SelenideElement loginLink = $(By.xpath("/html/body/div[2]/div/header/div[1]/div[2]/div[2]/nav/ul/li/a"));
    SelenideElement userNameField  = $(By.name("name"));
    SelenideElement userPasswordField  = $(By.name("pass"));
    SelenideElement userLoginButton = $(".ui-dialog-buttonset");


    public MainPage open(){
        Selenide.open("/");
        return this;
    }


    public UserProfilePage loginUser(String userMail, String userPassword){
        loginLink.click();
        userNameField.setValue(userMail);
        userPasswordField.setValue(userPassword);
        userLoginButton.click();

        return new UserProfilePage();
    }

}

