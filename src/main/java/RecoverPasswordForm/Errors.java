package RecoverPasswordForm;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Errors {

    SelenideElement openPopinLink = $(By.xpath("/html/body/div[2]/div/header/div[1]/div[2]/div[2]/nav/ul/li/a"));
    SelenideElement recoverPasswordLinkFR = $("a[href='/fr/user/password']");
    SelenideElement recoverPasswordLinkEN = $("a[href='/en/user/password']");
    SelenideElement buttonTitle = $(".ui-dialog-buttonset");
    SelenideElement emailField  = $(By.name("name"));
    SelenideElement emptyFieldError = $(".messages");
    SelenideElement popinTitle = $(".ui-dialog-title");





    public Errors openFR(){
        Selenide.open("/");
        return this;
    }

    public Errors openLoginPopinFR(){
        openPopinLink.click();
        return this;
    }

    public Errors checkPopinOpenedFR(String PopinTitleFR){
        popinTitle.shouldHave(Condition.text(PopinTitleFR));
        return this;
    }

    public Errors getPopinFR(){
        recoverPasswordLinkFR.click();
        return this;
    }

    public Errors requredFieldErrorFR(String requredFieldErrorFR){
        buttonTitle.click();
        emptyFieldError.shouldHave(Condition.text(requredFieldErrorFR));
        return this;

    }

    public Errors invalidFieldErrorFR(String invalidEmail, String invalidFieldErrorFR){
        emailField.setValue(invalidEmail);
        buttonTitle.click();
        emptyFieldError.shouldHave(Condition.text(invalidFieldErrorFR));
        return this;

    }

    public Errors nonexistentEmailFR(String nonexistentEmail, String nonexistentEmailFR){
        emailField.setValue(nonexistentEmail);
        buttonTitle.click();
        emptyFieldError.shouldHave(Condition.text(nonexistentEmailFR));
        return this;

    }


    public Errors openEN(){
        Selenide.open("/en");
        return this;
    }

    public Errors openLoginPopinEN(){
        openPopinLink.click();
        return this;
    }

    public Errors getPopinEN(){
        recoverPasswordLinkEN.click();
        return this;
    }

    public Errors checkPopinOpenedEN(String popinTitleEN){
        popinTitle.shouldHave(Condition.text(popinTitleEN));
        return this;
    }

    public Errors clickButton(){
        buttonTitle.click();
        return this;
    }


    public Errors requredFieldErrorEN(String requredFieldErrorEN){
        emptyFieldError.shouldHave(Condition.text(requredFieldErrorEN));
        return this;

    }
    public Errors invalidFieldErrorEN(String invalidEmail, String invalidFieldErrorEN){
        emailField.setValue(invalidEmail);
        buttonTitle.click();
        emptyFieldError.shouldHave(Condition.text(invalidFieldErrorEN));
        return this;

    }

    public Errors nonexistentEmailEN(String nonexistentEmail, String nonexistentEmailEN){
        emailField.setValue(nonexistentEmail);
        buttonTitle.click();
        emptyFieldError.shouldHave(Condition.text(nonexistentEmailEN));
        return this;

    }

}
