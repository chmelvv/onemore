package LoginForm.Errors;

import LoginForm.Elements.BaseTest;
import LoginForm.Elements.Errors;
import LoginForm.Elements.MainPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.util.Arrays;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ErrorMessagesTest extends BaseTest {

    Errors errors = new Errors();

    @Test
    public void EmptyFieldsTestFR() {
    //Both fields are empty
        errors.openFR()
                .openPopin()
                .clickSubmitButton()
                .errorRequredEmailfield1FR()
                .errorRequredPasswordfield1FR();
    }

        @Test
        public void WrongUsernameFieldFR(){
        //Wrong Username field, password field is empty
            errors.openFR()
                    .openPopin()
                    .userEmail("test")
                    .clickSubmitButton()
                    .errorRequredPasswordfield2FR()
                    .errorIncorrectEmailfieldFR();

        }


        @Test
        public void EmptyPasswordFieldFR() {
        //Password field is empty
            errors.openFR()
                    .openPopin()
                    .userEmail("test@test.com")
                    .clickSubmitButton()
                    .errorRequredPasswordfield2FR()
                    .errorWrongCredentials1FR();

        }

        @Test
        public void WrongCredentialsFR() {
        //Wrong credentials
            errors.openFR()
                    .openPopin()
                    .userEmail("test@test.com")
                    .userPassword("demo1234")
                    .clickSubmitButton()
                    .errorWrongCredentials2FR();


        }


        @Test
        public void EmptyUsernameFieldFR() {
        //Username is empty
            errors.openFR()
                    .openPopin()
                    .userPassword("demo1234")
                    .clickSubmitButton()
                    .errorRequredEmailfield2FR();

    }


    public void EmptyFieldsTestEN() {
        //Both fields are empty
        errors.openEN()
                .openPopin()
                .clickSubmitButton()
                .errorRequredEmailfield1EN()
                .errorRequredPasswordfield1EN();
    }

    @Test
    public void WrongUsernameFieldEN(){
        //Wrong Username field, password field is empty
        errors.openEN()
                .openPopin()
                .userEmail("test")
                .clickSubmitButton()
                .errorRequredPasswordfield2EN()
                .errorIncorrectEmailfieldEN();

    }


    @Test
    public void EmptyPasswordFieldEN() {
        //Password field is empty
        errors.openEN()
                .openPopin()
                .userEmail("test@test.com")
                .clickSubmitButton()
                .errorRequredPasswordfield2EN()
                .errorWrongCredentials1EN();

    }

    @Test
    public void WrongCredentialsEN() {
        //Wrong credentials
        errors.openEN()
                .openPopin()
                .userEmail("test@test.com")
                .userPassword("demo1234")
                .clickSubmitButton()
                .errorWrongCredentials2EN();


    }


    @Test
    public void EmptyUsernameFieldEN() {
        //Username is empty
        errors.openEN()
                .openPopin()
                .userPassword("demo1234")
                .clickSubmitButton()
                .errorRequredEmailfield2EN();

    }

}
