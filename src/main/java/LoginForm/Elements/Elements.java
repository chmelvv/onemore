package LoginForm.Elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;





public class Elements {

    SelenideElement openPopinLink = $(By.xpath("/html/body/div[2]/div/header/div[1]/div[2]/div[2]/nav/ul/li/a"));
    SelenideElement popinTitle = $(".ui-dialog-title");
    SelenideElement nomPlaceholder = $("input[name='name']");
    SelenideElement passwordPlaceholder =  $("input[name='pass']");
    SelenideElement recoverPasswordLinkFR = $("a[href='/fr/user/password']");
    SelenideElement recoverPasswordLinkEN = $("a[href='/en/user/password']");
    SelenideElement buttonTitle = $(".ui-dialog-buttonset");


    public Elements openFR(){
        Selenide.open("/");
        return this;
    }

    public Elements openPopin(){
        openPopinLink.click();
        return this;
    }


    public Elements popinTitleFR(){
        popinTitle.shouldHave(Condition.text("Se connecter"));
        return this;
    }

    public Elements PlaceholdersFR(){
        nomPlaceholder.shouldHave(attribute("placeholder","Adresse email"));
        passwordPlaceholder.shouldHave(attribute("placeholder","Mot de passe"));
        return this;

    }

    public Elements recoverPasswordLinkFR(){
        recoverPasswordLinkFR.shouldHave(Condition.text("Mot de passe oublié ?"));
        return this;

    }

    public Elements titleOfSubmitButtonFR(){
        buttonTitle.shouldHave(Condition.text("Se connecter"));
        return this;

    }


    public Elements openEN(){
        Selenide.open("/en");
        return this;
    }



    public Elements popinTitleEN(){
        popinTitle.shouldHave(Condition.text("Log in"));
        return this;
    }

    public Elements PlaceholdersEN(){
        nomPlaceholder.shouldHave(attribute("placeholder","Mail address"));
        passwordPlaceholder.shouldHave(attribute("placeholder","Password"));
        return this;

    }

    public Elements recoverPasswordLinkEN(){
        recoverPasswordLinkEN.shouldHave(Condition.text("Forgotten password?"));
        return this;

    }

    public Elements titleOfSubmitButtonEN(){
        buttonTitle.shouldHave(Condition.text("Log in"));
        return this;

    }


}
