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

    public Errors checkPopinOpenedFR(){
        popinTitle.shouldHave(Condition.text("Réinitialiser votre mot de passe"));
        return this;
    }

    public Errors getPopinFR(){
        recoverPasswordLinkFR.click();
        return this;
    }

    public Errors requredFieldErrorFR(){
        buttonTitle.click();
        emptyFieldError.shouldHave(Condition.text("Le champ Nom d'utilisateur ou adresse courriel est requis."));
        return this;

    }

    public Errors invalidFieldErrorFR(){
        emailField.setValue("test");
        buttonTitle.click();
        emptyFieldError.shouldHave(Condition.text("test n'est pas reconnu comme nom d'utilisateur ou adresse de courriel."));
        return this;

    }

    public Errors nonexistentEmailFR(){
        emailField.setValue("nonexistent@email.com");
        buttonTitle.click();
        emptyFieldError.shouldHave(Condition.text("nonexistent@email.com n'est pas reconnu comme nom d'utilisateur ou adresse de courriel."));
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

    public Errors checkPopinOpenedEN(){
        popinTitle.shouldHave(Condition.text("Reset your password"));
        return this;
    }

    public Errors clickButton(){
        buttonTitle.click();
        return this;
    }


    public Errors requredFieldErrorEN(){
        emptyFieldError.shouldHave(Condition.text("Username or email address field is required."));
        return this;

    }
    public Errors invalidFieldErrorEN(){
        emailField.setValue("test");
        buttonTitle.click();
        emptyFieldError.shouldHave(Condition.text("test is not recognized as a username or an email address."));
        return this;

    }

    public Errors nonexistentEmailEN(){
        emailField.setValue("nonexistent@email.com");
        buttonTitle.click();
        emptyFieldError.shouldHave(Condition.text("nonexistent@email.com is not recognized as a username or an email address."));
        return this;

    }

}
