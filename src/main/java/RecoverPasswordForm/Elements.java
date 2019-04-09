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

    public Elements checkElementsFR(String popinTitleFR, String emailFieldPlaceholderFR, String DescriptionFR, String buttonTitleFR){
        popinTitle.shouldHave(Condition.text(popinTitleFR));
        emailFieldlaceholder.shouldHave(attribute("placeholder",emailFieldPlaceholderFR));
        description.shouldHave(Condition.text(DescriptionFR));
        buttonTitle.shouldHave(Condition.text(buttonTitleFR));
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

    public Elements checkElementsEN(String popinTitleEN, String emailFieldPlaceholderEN, String DescriptionEN, String buttonTitleEN){
        popinTitle.shouldHave(Condition.text(popinTitleEN));
        emailFieldlaceholder.shouldHave(attribute("placeholder",emailFieldPlaceholderEN));
        description.shouldHave(Condition.text(DescriptionEN));
        buttonTitle.shouldHave(Condition.text(buttonTitleEN));
        return this;
    }





}
