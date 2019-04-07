package RecoverPasswordForm;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;

public class Elements {

    SelenideElement openPopinLink = $(By.xpath("/html/body/div[2]/div/header/div[1]/div[2]/div[2]/nav/ul/li/a"));
    SelenideElement recoverPasswordLinkFR = $("a[href='/fr/user/password']");
    SelenideElement recoverPasswordLinkEN = $("a[href='/en/user/password']");
    SelenideElement popinTitle = $(".ui-dialog-title");
    SelenideElement emailFieldlaceholder = $("input[name='name']");
    SelenideElement description = $(".user-pass");
    SelenideElement buttonTitle = $(".ui-dialog-buttonset");


    public Elements openFR(){
        Selenide.open("/");
        return this;
    }

    public Elements getPopinFR(){
        openPopinLink.click();
        recoverPasswordLinkFR.click();
        return this;
    }

    public Elements checkElementsFR(){
        popinTitle.shouldHave(Condition.text("Réinitialiser votre mot de passe"));
        emailFieldlaceholder.shouldHave(attribute("placeholder","Nom d'utilisateur ou adresse courriel"));
        description.shouldHave(Condition.text("Les instructions de réinitialisation du mot de passe seront envoyées à votre adresse e-mail enregistrée."));
        buttonTitle.shouldHave(Condition.text("Soumettre"));
        return this;
    }

    public Elements openEN(){
        Selenide.open("/en");
        return this;
    }

    public Elements getPopinEN(){
        openPopinLink.click();
        recoverPasswordLinkEN.click();
        return this;
    }

    public Elements checkElementsEN(){
        popinTitle.shouldHave(Condition.text("Reset your password"));
        emailFieldlaceholder.shouldHave(attribute("placeholder","Username or email address"));
        description.shouldHave(Condition.text("Password reset instructions will be sent to your registered email address."));
        buttonTitle.shouldHave(Condition.text("Submit"));
        return this;
    }





}
