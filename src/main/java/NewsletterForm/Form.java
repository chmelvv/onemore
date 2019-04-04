package NewsletterForm;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Form {

    SelenideElement CookieBanerSubmitButton = $("button.agree-button");
    SelenideElement NomField = $(By.name("last_name"));
    SelenideElement PrenomField = $(By.name("first_name"));
    SelenideElement EmailField = $(By.name("email"));
    SelenideElement SecteurFieldPart1 = $(".ui-selectmenu-button");
    SelenideElement SecteurFieldPart2FR = $$("#edit-sector-select-menu li div").filter(Condition.text("Audit")).first();
    SelenideElement SecteurFieldPart2EN = $$("#edit-sector-select-menu li div").filter(Condition.text("Bank")).first();
    SelenideElement SociétéField = $("#edit-company");
    SelenideElement TéléphoneField = $("#edit-phone");
    SelenideElement AdresseField = $("#edit-adresse-address");
    SelenideElement VilleField = $("#edit-adresse-city");
    SelenideElement CodePostalFiled = $("#edit-adresse-postal-code");
    SelenideElement CountryFieldPart1 = $("#edit-adresse-country-button");
    SelenideElement CountryFieldPart2FR = $$("#edit-adresse-country-menu li div").filter(Condition.text("Albanie")).first();
    SelenideElement CountryFieldPart2EN = $$("#edit-adresse-country-menu li div").filter(Condition.text("Algeria")).first();
    SelenideElement Checkbox = $("label.option");
    SelenideElement SubmitButon = $("input#edit-submit");

    public Form openFR(){
        Selenide.open("/inscription-newsletter");
        return this;
    }

    public Homepage SubmitNewsletterFormFR
            ( String userNom, String userPrenom, String userEmail, String userSociété, String userTéléphone,
              String userAdresse, String userVille, String userCodePostal) {

    CookieBanerSubmitButton.click();
    NomField.setValue(userNom);
    PrenomField.setValue(userPrenom);
    EmailField.setValue(userEmail);
    SecteurFieldPart1.click();
    SecteurFieldPart2FR.click();
    SociétéField.setValue(userSociété);
    TéléphoneField.setValue(userTéléphone);
    AdresseField.setValue(userAdresse);
    VilleField.setValue(userVille);
    CodePostalFiled.setValue(userCodePostal);
    CountryFieldPart1.click();
    CountryFieldPart2FR.click();
    Checkbox.click();
    SubmitButon.click();

    return new Homepage();

    }

    public Form openEN(){
        Selenide.open("en/subscribe-our-newsletter");
        return this;
    }

    public Homepage SubmitNewsletterFormEN
            ( String userNom, String userPrenom, String userEmail, String userSociété, String userTéléphone,
              String userAdresse, String userVille, String userCodePostal) {

        CookieBanerSubmitButton.click();
        NomField.setValue(userNom);
        PrenomField.setValue(userPrenom);
        EmailField.setValue(userEmail);
        SecteurFieldPart1.click();
        SecteurFieldPart2EN.click();
        SociétéField.setValue(userSociété);
        TéléphoneField.setValue(userTéléphone);
        AdresseField.setValue(userAdresse);
        VilleField.setValue(userVille);
        CodePostalFiled.setValue(userCodePostal);
        CountryFieldPart1.click();
        CountryFieldPart2EN.click();
        Checkbox.click();
        SubmitButon.click();

        return new Homepage();

    }

}
