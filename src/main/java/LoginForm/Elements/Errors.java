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

    public Errors errorRequredEmailfield1FR(String requredEmailFieldFR){
        requredEmailField.shouldHave(text(requredEmailFieldFR));
        return this;

    }

    public Errors errorRequredEmailfield1EN(String requredEmailFieldEN){
        requredEmailField.shouldHave(text(requredEmailFieldEN));
        return this;

    }

    public Errors errorRequredPasswordfield1FR(String requredPasswordFiledFR){
        requredPasswordFiled.shouldHave(text(requredPasswordFiledFR));
        return this;

    }

    public Errors errorRequredPasswordfield1EN(String requredPasswordFiledEN){
        requredPasswordFiled.shouldHave(text(requredPasswordFiledEN));
        return this;

    }


    public Errors errorIncorrectEmailfieldFR(String wrongCredentialsFR){
        requredPasswordFiled.shouldHave(text(wrongCredentialsFR));
        return this;
    }

    public Errors errorIncorrectEmailfieldEN(String wrongCredentialsEN){
        requredPasswordFiled.shouldHave(text(wrongCredentialsEN));
        return this;
    }

    public Errors errorRequredPasswordfield2FR(String requredPasswordFiledFR){
        requredEmailField.shouldHave(text(requredPasswordFiledFR));
        return this;

    }


    public Errors errorRequredPasswordfield2EN(String requredPasswordFiledEN){
        requredEmailField.shouldHave(text(requredPasswordFiledEN));
        return this;

    }

    public Errors errorWrongCredentials1FR(String wrongCredentialsFR) {
        requredPasswordFiled.shouldHave(text(wrongCredentialsFR));
        return this;
    }

    public Errors errorWrongCredentials1EN(String wrongCredentialsEN) {
        requredPasswordFiled.shouldHave(text(wrongCredentialsEN));
        return this;
    }

    public Errors errorWrongCredentials2FR(String wrongCredentialsFR){
        wrongCredentials.shouldHave(text(wrongCredentialsFR));
        return this;

    }

    public Errors errorWrongCredentials2EN(String wrongCredentialsEN){
        wrongCredentials.shouldHave(text(wrongCredentialsEN));
        return this;

    }

    public Errors errorRequredEmailfield2FR(String requredEmailFieldFR){
        wrongCredentials.shouldHave(text(requredEmailFieldFR));
        return this;

    }

    public Errors errorRequredEmailfield2EN(String requredEmailFieldEN){
        wrongCredentials.shouldHave(text(requredEmailFieldEN));
        return this;

    }



}
