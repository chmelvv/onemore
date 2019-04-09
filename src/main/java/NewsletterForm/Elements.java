package NewsletterForm;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;

public class Elements {

    SelenideElement Title = $(".field--name-title");
    SelenideElement Description = $(".field--name-lead");
    SelenideElement NomlField = $(".form-item-last-name");
    SelenideElement PrenomField = $(".form-item-first-name");
    SelenideElement EmailField = $(".form-item-email");
    SelenideElement SecteurField = $(".fieldset-legend");
    SelenideElement SociétéField = $(".form-item-company");
    SelenideElement TelField = $(".form-item-phone");
    SelenideElement AdresseField = $(".form-item-adresse-address");
    SelenideElement VilleField = $(".form-item-adresse-city");
    SelenideElement CodePostalField = $(".form-item-adresse-postal-code");
    SelenideElement PaysField = $(".form-item-adresse-country");
    SelenideElement Checkbox = $("label.option");
    SelenideElement SubmitButon = $("input#edit-submit");



    public Elements openFR() {
        Selenide.open("/inscription-newsletter");
        return this;
    }

    public Elements TitleFR(String TitleFR){
        Title.shouldHave(Condition.text(TitleFR));
        return this;
    }

    public Elements DescriptionFR(String DescriptionFR){
        Description.shouldHave(Condition.text(DescriptionFR));
        return this;
    }

    public Elements TitlesOfFieldsFR(String NomFieldFR, String PrenomFieldFR, String EmailFieldFR, String SecteurFieldFR, String SociétéFieldFR, String TelFieldFR, String AdresseFieldFR, String VilleFieldFR, String CodePostalFieldFR, String PaysFieldFR, String CheckboxFR){
        NomlField.shouldHave(Condition.text(NomFieldFR));
        PrenomField.shouldHave(Condition.text(PrenomFieldFR));
        EmailField.shouldHave(Condition.text(EmailFieldFR));
        SecteurField.shouldHave(Condition.text(SecteurFieldFR));
        SociétéField.shouldHave(Condition.text(SociétéFieldFR));
        TelField.shouldHave(Condition.text(TelFieldFR));
        AdresseField.shouldHave(Condition.text(AdresseFieldFR));
        VilleField.shouldHave(Condition.text(VilleFieldFR));
        CodePostalField.shouldHave(Condition.text(CodePostalFieldFR));
        PaysField.shouldHave(Condition.text(PaysFieldFR));
        Checkbox.shouldHave(Condition.text(CheckboxFR));


        return this;
    }

    public Elements TitleOFbuttonFR(String SubmitButtonFR){
        SubmitButon.shouldHave(attribute("value",SubmitButtonFR));
        return this;
    }

    public Elements openEN() {
        Selenide.open("/en/subscribe-our-newsletter");
        return this;
    }

    public Elements TitleEN(String TitleEN){
        Title.shouldHave(Condition.text(TitleEN));
        return this;
    }

    public Elements DescriptionEN(String DescriptionEN) {
        Description.shouldHave(Condition.text(DescriptionEN));
        return this;
    }



    public Elements TitlesOfFieldsEN(String NomFieldEN, String PrenomFieldEN, String EmailFieldEN, String SecteurFieldEN, String SociétéFieldEN, String TelFieldEN, String AdresseFieldEN, String VilleFieldEN, String CodePostalFieldEN, String PaysFieldEN, String CheckboxEN){
        NomlField.shouldHave(Condition.text(NomFieldEN));
        PrenomField.shouldHave(Condition.text(PrenomFieldEN));
        EmailField.shouldHave(Condition.text(EmailFieldEN));
        SecteurField.shouldHave(Condition.text(SecteurFieldEN));
        SociétéField.shouldHave(Condition.text(SociétéFieldEN));
        TelField.shouldHave(Condition.text(TelFieldEN));
        AdresseField.shouldHave(Condition.text(AdresseFieldEN));
        VilleField.shouldHave(Condition.text(VilleFieldEN));
        CodePostalField.shouldHave(Condition.text(CodePostalFieldEN));
        PaysField.shouldHave(Condition.text(PaysFieldEN));
        Checkbox.shouldHave(Condition.text(CheckboxEN));

        return this;
    }

    public Elements TitleOFbuttonEN(String SubmitButtonEN){
        SubmitButon.shouldHave(attribute("value", SubmitButtonEN));
        return this;
    }

}
