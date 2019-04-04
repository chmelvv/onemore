package LoginForm.Elements;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {


    SelenideElement openPopinLink = $(By.xpath("/html/body/div[2]/div/header/div[1]/div[2]/div[2]/nav/ul/li/a"));
    SelenideElement submitButton = $(".ui-dialog-buttonset");
    SelenideElement emailFiled = $(By.name("name"));
    SelenideElement passwordField = $(By.name("pass"));


    public MainPage open(){
        Selenide.open("/");
        return this;
    }

    public MainPage openPopin(){
        openPopinLink.click();
        return this;
    }

    public MainPage clickSubmitButton(){
        submitButton.click();
        return this;
    }

    public MainPage userEmail(String userEmail){
        emailFiled.setValue(userEmail);
        return this;
    }

    public MainPage userPassword(String userPassword){
        passwordField.setValue(userPassword);
        return this;
    }

}





