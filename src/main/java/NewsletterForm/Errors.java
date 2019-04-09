package NewsletterForm;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Errors {

    SelenideElement CookieBanerSubmitButton = $("button.agree-button");
    SelenideElement SubmitButon = $("input#edit-submit");
    SelenideElement requredNomField = $(".messages__list li:nth-child(1)");
    SelenideElement requredPrenomField = $(".messages__list li:nth-child(2)");
    SelenideElement requredEmailField = $(".messages__list li:nth-child(3)");
    SelenideElement requredSecteurField = $(".messages__list li:nth-child(4)");
    SelenideElement requredSociétéField = $(".messages__list li:nth-child(5)");
    SelenideElement requredTelField = $(".messages__list li:nth-child(6)");
    SelenideElement requredRulesField = $(".messages__list li:nth-child(7)");
    SelenideElement EmailField = $(By.name("email"));





    public Errors openFR() {
        Selenide.open("/inscription-newsletter");
        CookieBanerSubmitButton.click();
        return this;
    }

    public Errors submitForm(){
        SubmitButon.click();
        return this;
    }


    public Errors requredFieldsFR(String requredNomFieldFR, String requredPrenomFieldFR, String requredEmailFieldFR, String requredSecteurFieldFR, String requredSociétéFieldFR, String requredTelFieldFR, String requredRulesFieldFR) {
        requredNomField.shouldHave(Condition.text(requredNomFieldFR));
        requredPrenomField.shouldHave(Condition.text(requredPrenomFieldFR));
        requredEmailField.shouldHave(Condition.text(requredEmailFieldFR));
        requredSecteurField.shouldHave(Condition.text(requredSecteurFieldFR));
        requredSociétéField.shouldHave(Condition.text(requredSociétéFieldFR));
        requredTelField.shouldHave(Condition.text(requredTelFieldFR));
        requredRulesField.shouldHave(Condition.text(requredRulesFieldFR));

        return this;
    }


    public Errors invalidEmailField(String invalidEmailField) {
        EmailField.setValue(invalidEmailField);
        return this;
    }



    public Errors invalidEmailErrorFR(String invalidEmailErrorFR){
        requredEmailField.shouldHave(Condition.text(invalidEmailErrorFR));

        return this;

    }




    public Errors openEN() {
        Selenide.open("/en/subscribe-our-newsletter");
        CookieBanerSubmitButton.click();
        return this;
    }



    public Errors requredFieldsEN(String requredNomFieldEN, String requredPrenomFieldEN, String requredEmailFieldEN, String requredSecteurFieldEN, String requredSociétéFieldEN, String requredTelFieldEN, String requredRulesFieldEN) {
        requredNomField.shouldHave(Condition.text(requredNomFieldEN));
        requredPrenomField.shouldHave(Condition.text(requredPrenomFieldEN));
        requredEmailField.shouldHave(Condition.text(requredEmailFieldEN));
        requredSecteurField.shouldHave(Condition.text(requredSecteurFieldEN));
        requredSociétéField.shouldHave(Condition.text(requredSociétéFieldEN));
        requredTelField.shouldHave(Condition.text(requredTelFieldEN));
        requredRulesField.shouldHave(Condition.text(requredRulesFieldEN));
        return this;
    }


    public Errors invalidEmailErrorEN(String invalidEmailErrorEN){
        requredEmailField.shouldHave(Condition.text(invalidEmailErrorEN));

        return this;

    }

}



