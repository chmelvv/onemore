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


    public Elements popinTitleFR(String popinTitleFR){
        popinTitle.shouldHave(Condition.text(popinTitleFR));
        return this;
    }

    public Elements PlaceholdersFR(String nomPlaceholderFR, String passwordPalceholderFR){
        nomPlaceholder.shouldHave(attribute("placeholder",nomPlaceholderFR));
        passwordPlaceholder.shouldHave(attribute("placeholder",passwordPalceholderFR));
        return this;

    }

    public Elements recoverPasswordLinkFR(String recoverPasswordFR){
        recoverPasswordLinkFR.shouldHave(Condition.text(recoverPasswordFR));
        return this;

    }

    public Elements titleOfSubmitButtonFR(String buttonTitleFR){
        buttonTitle.shouldHave(Condition.text(buttonTitleFR));
        return this;

    }


    public Elements openEN(){
        Selenide.open("/en");
        return this;
    }



    public Elements popinTitleEN(String popinTitleEN){
        popinTitle.shouldHave(Condition.text(popinTitleEN));
        return this;
    }

    public Elements PlaceholdersEN(String nomPlaceholderEN, String passwordPalceholderEN){
        nomPlaceholder.shouldHave(attribute("placeholder",nomPlaceholderEN));
        passwordPlaceholder.shouldHave(attribute("placeholder",passwordPalceholderEN));
        return this;

    }

    public Elements recoverPasswordLinkEN(String recoverPasswordEN){
        recoverPasswordLinkEN.shouldHave(Condition.text(recoverPasswordEN));
        return this;

    }

    public Elements titleOfSubmitButtonEN(String buttonTitleEN){
        buttonTitle.shouldHave(Condition.text(buttonTitleEN));
        return this;

    }


}
