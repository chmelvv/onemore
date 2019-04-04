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
//        CookieBanerSubmitButton.click();
        return this;
    }

    public Errors submitForm(){
        SubmitButon.click();
        return this;
    }


    public Errors requredFieldsFR() {
        requredNomField.shouldHave(Condition.text("Le champ Nom est requis."));
        requredPrenomField.shouldHave(Condition.text("Le champ Prénom est requis."));
        requredEmailField.shouldHave(Condition.text("Le champ Email est requis."));
        requredSecteurField.shouldHave(Condition.text("Le champ Secteur est requis."));
        requredSociétéField.shouldHave(Condition.text("Le champ Société est requis."));
        requredTelField.shouldHave(Condition.text("Le champ Téléphone est requis."));
        requredRulesField.shouldHave(Condition.text("Le champ En complétant ce formulaire, vous validez les Conditions Générales d’Utilisation et acceptez que L'Agefi SA, responsable de traitement, traite vos données personnelles à des fins de création et gestion de votre compte utilisateur. Pour en savoir plus sur vos droits et nos pratiques en matière de protection de vos données personnelles, suivez ce lien : Politique de confidentialité.  Vous êtes susceptible de recevoir des actualités et offres par L'Agefi SA. Si vous ne le souhaitez pas, cochez la case  est requis."));

        return this;
    }


    public Errors invalidEmailField() {
        EmailField.setValue("test");
        return this;
    }



    public Errors invalidEmailErrorFR(){
        requredEmailField.shouldHave(Condition.text("L'adresse de courriel test n'est pas valide."));

        return this;

    }




    public Errors openEN() {
        Selenide.open("/en/subscribe-our-newsletter");
//        CookieBanerSubmitButton.click();
        return this;
    }



    public Errors requredFieldsEN() {
        requredNomField.shouldHave(Condition.text("Last name field is required."));
        requredPrenomField.shouldHave(Condition.text("First name field is required."));
        requredEmailField.shouldHave(Condition.text("Email field is required."));
        requredSecteurField.shouldHave(Condition.text("Sector field is required."));
        requredSociétéField.shouldHave(Condition.text("Company field is required."));
        requredTelField.shouldHave(Condition.text("Phone field is required."));
        requredRulesField.shouldHave(Condition.text("By completing this form, you accept the General Terms of Use and agree that AGEFI SA, the body responsible for data processing, will process your data for the purposes of creation and management of your user account. For further information about your rights and our practices to protect your personal data, follow this link: Confidentiality policy. You may receive updates and offers from AGEFI SA. If you do not wish to receive updates and offers, tick the box field is required."));

        return this;
    }


    public Errors invalidEmailErrorEN(){
        requredEmailField.shouldHave(Condition.text("The email address test is not valid."));

        return this;

    }

}



