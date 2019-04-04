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

    public Elements TitleFR(){
        Title.shouldHave(Condition.text("Inscription newsletter"));
        return this;
    }

    public Elements DescriptionFR(){
        Description.shouldHave(Condition.text("Chaque jeudi, le meilleur de l'info de Newsmanagers !"));
        return this;
    }

    public Elements TitlesOfFieldsFR(){
        NomlField.shouldHave(Condition.text("Nom"));
        PrenomField.shouldHave(Condition.text("Prénom"));
        EmailField.shouldHave(Condition.text("Email"));
        SecteurField.shouldHave(Condition.text("Secteur"));
        SociétéField.shouldHave(Condition.text("Société"));
        TelField.shouldHave(Condition.text("Téléphone"));
        AdresseField.shouldHave(Condition.text("Adresse"));
        VilleField.shouldHave(Condition.text("Ville"));
        CodePostalField.shouldHave(Condition.text("Code postal"));
        PaysField.shouldHave(Condition.text("Pays"));
        Checkbox.shouldHave(Condition.text("En complétant ce formulaire, vous validez les Conditions Générales d’Utilisation et acceptez que L'Agefi SA, responsable de traitement, traite vos données personnelles à des fins de création et gestion de votre compte utilisateur. Pour en savoir plus sur vos droits et nos pratiques en matière de protection de vos données personnelles, suivez ce lien : Politique de confidentialité.  Vous êtes susceptible de recevoir des actualités et offres par L'Agefi SA. Si vous ne le souhaitez pas, cochez la case "));


        return this;
    }

    public Elements TitleOFbuttonFR(){
        SubmitButon.shouldHave(attribute("value","Soumettre"));
        return this;
    }

    public Elements openEN() {
        Selenide.open("/en/subscribe-our-newsletter");
        return this;
    }

    public Elements TitleEN(){
        Title.shouldHave(Condition.text("Subscribe to our newsletter"));
        return this;
    }

    public Elements DescriptionEN() {
        Description.shouldHave(Condition.text("Get the best of Newsmanagers, every Thursday!"));
        return this;
    }



    public Elements TitlesOfFieldsEN(){
        NomlField.shouldHave(Condition.text("Last name"));
        PrenomField.shouldHave(Condition.text("First name"));
        EmailField.shouldHave(Condition.text("Email"));
        SecteurField.shouldHave(Condition.text("Sector"));
        SociétéField.shouldHave(Condition.text("Company"));
        TelField.shouldHave(Condition.text("Phone"));
        AdresseField.shouldHave(Condition.text("Address"));
        VilleField.shouldHave(Condition.text("City/Town"));
        CodePostalField.shouldHave(Condition.text("ZIP/Postal Code"));
        PaysField.shouldHave(Condition.text("Country"));
        Checkbox.shouldHave(Condition.text("By completing this form, you accept the General Terms of Use and agree that AGEFI SA, the body responsible for data processing, will process your data for the purposes of creation and management of your user account. For further information about your rights and our practices to protect your personal data, follow this link: Confidentiality policy. You may receive updates and offers from AGEFI SA. If you do not wish to receive updates and offers, tick the box"));

        return this;
    }

    public Elements TitleOFbuttonEN(){
        SubmitButon.shouldHave(attribute("value","Submit"));
        return this;
    }

}
