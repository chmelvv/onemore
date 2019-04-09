package LoginForm.Errors;

import Base.BaseTest;
import LoginForm.Elements.Errors;
import org.testng.annotations.Test;
import lombok.*;

public class ErrorMessagesTest extends BaseTest {

    Errors errors = new Errors();
    Strings expectedStrings = new Strings();
    UserInfo userInfo = new UserInfo();

    @Test
    public void EmptyFieldsTestFR() {
        Errors errors = new Errors();
        Strings expectedStrings = new Strings();
        UserInfo userInfo = new UserInfo();
    //Both fields are empty
        errors.openFR()
                .openPopin()
                .clickSubmitButton()
                .errorRequredEmailfield1FR(expectedStrings.getRequredEmailFieldFR())
                .errorRequredPasswordfield1FR(expectedStrings.getRequredPasswordFiledFR());
    }

        @Test
        public void WrongUsernameFieldFR(){
            Errors errors = new Errors();
            Strings expectedStrings = new Strings();
            UserInfo userInfo = new UserInfo();
        //Wrong Username field, password field is empty
            errors.openFR()
                    .openPopin()
                    .userEmail(userInfo.getUserIncorrectEmail())
                    .clickSubmitButton()
                    .errorRequredPasswordfield2FR(expectedStrings.getRequredPasswordFiledFR())
                    .errorIncorrectEmailfieldFR(expectedStrings.getWrongCredentialsFR());

        }


        @Test
        public void EmptyPasswordFieldFR() {
            Errors errors = new Errors();
            Strings expectedStrings = new Strings();
            UserInfo userInfo = new UserInfo();
        //Password field is empty
            errors.openFR()
                    .openPopin()
                    .userEmail(userInfo.getUserCorrectEmail())
                    .clickSubmitButton()
                    .errorRequredPasswordfield2FR(expectedStrings.getRequredPasswordFiledFR())
                    .errorWrongCredentials1FR(expectedStrings.getWrongCredentialsFR());

        }

        @Test
        public void WrongCredentialsFR() {
            Errors errors = new Errors();
            Strings expectedStrings = new Strings();
            UserInfo userInfo = new UserInfo();
        //Wrong credentials
            errors.openFR()
                    .openPopin()
                    .userEmail(userInfo.getUserCorrectEmail())
                    .userPassword(userInfo.getUserPassword())
                    .clickSubmitButton()
                    .errorWrongCredentials2FR(expectedStrings.getWrongCredentialsFR());


        }


        @Test
        public void EmptyUsernameFieldFR() {
            Errors errors = new Errors();
            Strings expectedStrings = new Strings();
            UserInfo userInfo = new UserInfo();
        //Username is empty
            errors.openFR()
                    .openPopin()
                    .userPassword(userInfo.getUserPassword())
                    .clickSubmitButton()
                    .errorRequredEmailfield2FR(expectedStrings.getRequredEmailFieldFR());

    }

        @Test
        public void EmptyFieldsTestEN() {
            Errors errors = new Errors();
            Strings expectedStrings = new Strings();
            UserInfo userInfo = new UserInfo();
        //Both fields are empty
        errors.openEN()
                .openPopin()
                .clickSubmitButton()
                .errorRequredEmailfield1EN(expectedStrings.getRequredEmailFieldEN())
                .errorRequredPasswordfield1EN(expectedStrings.getRequredPasswordFiledEN());
    }

    @Test
    public void WrongUsernameFieldEN(){
        Errors errors = new Errors();
        Strings expectedStrings = new Strings();
        UserInfo userInfo = new UserInfo();
        //Wrong Username field, password field is empty
        errors.openEN()
                .openPopin()
                .userEmail(userInfo.getUserIncorrectEmail())
                .clickSubmitButton()
                .errorRequredPasswordfield2EN(expectedStrings.getRequredPasswordFiledEN())
                .errorIncorrectEmailfieldEN(expectedStrings.getWrongCredentialsEN());

    }


    @Test
    public void EmptyPasswordFieldEN() {
        Errors errors = new Errors();
        Strings expectedStrings = new Strings();
        UserInfo userInfo = new UserInfo();
        //Password field is empty
        errors.openEN()
                .openPopin()
                .userEmail(userInfo.getUserCorrectEmail())
                .clickSubmitButton()
                .errorRequredPasswordfield2EN(expectedStrings.getRequredPasswordFiledEN())
                .errorWrongCredentials1EN(expectedStrings.getWrongCredentialsEN());

    }

    @Test
    public void WrongCredentialsEN() {
        Errors errors = new Errors();
        Strings expectedStrings = new Strings();
        UserInfo userInfo = new UserInfo();
        //Wrong credentials
        errors.openEN()
                .openPopin()
                .userEmail(userInfo.getUserCorrectEmail())
                .userPassword(userInfo.getUserPassword())
                .clickSubmitButton()
                .errorWrongCredentials2EN(expectedStrings.getWrongCredentialsEN());


    }


    @Test
    public void EmptyUsernameFieldEN() {
        Errors errors = new Errors();
        Strings expectedStrings = new Strings();
        UserInfo userInfo = new UserInfo();
        //Username is empty
        errors.openEN()
                .openPopin()
                .userPassword(userInfo.getUserPassword())
                .clickSubmitButton()
                .errorRequredEmailfield2EN(expectedStrings.getRequredEmailFieldEN());

    }

}
