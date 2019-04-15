package RecoverPasswordForm;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;

public class ElementsSimple {

    SelenideElement openPopinLink = $("a[data-drupal-link-system-path='user/login']");
    //@TODO
    SelenideElement recoverPasswordLink = $("a.reset-pass-link");
    SelenideElement popinTitle = $(".ui-dialog-title");
    SelenideElement emailFieldlaceholder = $("input[name='name']");
    SelenideElement description = $(".user-pass");
    SelenideElement buttonTitle = $(".ui-dialog-buttonset");
    String language;

    public ElementsSimple(String language) {
        this.language = language;
    }


    public ElementsSimple open(){
        Selenide.open("/" + language + "/");
        return this;
    }

    public ElementsSimple getPopin(){
        openPopinLink.click();
        recoverPasswordLink.click();
        return this;
    }

    public ElementsSimple checkElements(String popinTitleFR, String emailFieldPlaceholderFR, String DescriptionFR, String buttonTitleFR){
        popinTitle.shouldHave(Condition.text(popinTitleFR));
        emailFieldlaceholder.shouldHave(attribute("placeholder",emailFieldPlaceholderFR));
        description.shouldHave(Condition.text(DescriptionFR));
        buttonTitle.shouldHave(Condition.text(buttonTitleFR));
        return this;
    }

    public ElementsSimple openEN(){
        Selenide.open("/en");
        return this;
    }

    public ElementsSimple getPopinEN(){
        openPopinLink.click();
        recoverPasswordLink.click();
        return this;
    }

    public ElementsSimple checkElementsEN(String popinTitleEN, String emailFieldPlaceholderEN, String DescriptionEN, String buttonTitleEN){
        popinTitle.shouldHave(Condition.text(popinTitleEN));
        emailFieldlaceholder.shouldHave(attribute("placeholder",emailFieldPlaceholderEN));
        description.shouldHave(Condition.text(DescriptionEN));
        buttonTitle.shouldHave(Condition.text(buttonTitleEN));
        return this;
    }





}
