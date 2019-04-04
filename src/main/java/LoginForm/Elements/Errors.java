package LoginForm.Elements;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class Errors {

    SelenideElement openPopinLink = $(By.xpath("/html/body/div[2]/div/header/div[1]/div[2]/div[2]/nav/ul/li/a"));
    SelenideElement submitButton = $(".ui-dialog-buttonset");
    SelenideElement requredEmailField = $(".messages__list li:nth-child(1)");
    SelenideElement requredPasswordFiled = $(".messages__list li:nth-child(2)");
    SelenideElement emailFiled = $(By.name("name"));
    SelenideElement passwordField = $(By.name("pass"));
    SelenideElement wrongCredentials = $(".messages div");

    public Errors openFR(){
        Selenide.open("/");
        return this;
    }

    public Errors openEN(){
        Selenide.open("/en");
        return this;
    }

    public Errors openPopin(){
        openPopinLink.click();
        return this;
    }

    public Errors clickSubmitButton(){
        submitButton.click();
        return this;
    }

    public Errors userEmail(String userEmail){
        emailFiled.setValue(userEmail);
        return this;
    }

    public Errors userPassword(String userPassword){
        passwordField.setValue(userPassword);
        return this;
    }

    public Errors errorRequredEmailfield1FR(){
        requredEmailField.shouldHave(text("Le champ Adresse email est requis."));
        return this;

    }

    public Errors errorRequredEmailfield1EN(){
        requredEmailField.shouldHave(text("Mail address field is required."));
        return this;

    }

    public Errors errorRequredPasswordfield1FR(){
        requredPasswordFiled.shouldHave(text("Le champ Mot de passe est requis."));
        return this;

    }

    public Errors errorRequredPasswordfield1EN(){
        requredPasswordFiled.shouldHave(text("Password field is required."));
        return this;

    }


    public Errors errorIncorrectEmailfieldFR(){
        requredPasswordFiled.shouldHave(text("Nom d'utilisateur ou mot de passe non reconnu."));
        return this;
    }

    public Errors errorIncorrectEmailfieldEN(){
        requredPasswordFiled.shouldHave(text("Unrecognized username or password. Forgot your password?"));
        return this;
    }

    public Errors errorRequredPasswordfield2FR(){
        requredEmailField.shouldHave(text("Le champ Mot de passe est requis."));
        return this;

    }


    public Errors errorRequredPasswordfield2EN(){
        requredEmailField.shouldHave(text("Password field is required."));
        return this;

    }

    public Errors errorWrongCredentials1FR() {
        requredPasswordFiled.shouldHave(text("Nom d'utilisateur ou mot de passe non reconnu."));
        return this;
    }

    public Errors errorWrongCredentials1EN() {
        requredPasswordFiled.shouldHave(text("Unrecognized username or password. Forgot your password?"));
        return this;
    }

    public Errors errorWrongCredentials2FR(){
        wrongCredentials.shouldHave(text("Nom d'utilisateur ou mot de passe non reconnu."));
        return this;

    }

    public Errors errorWrongCredentials2EN(){
        wrongCredentials.shouldHave(text("Unrecognized username or password. Forgot your password?"));
        return this;

    }

    public Errors errorRequredEmailfield2FR(){
        wrongCredentials.shouldHave(text("Le champ Adresse email est requis."));
        return this;

    }

    public Errors errorRequredEmailfield2EN(){
        wrongCredentials.shouldHave(text("Mail address field is required."));
        return this;

    }



}
