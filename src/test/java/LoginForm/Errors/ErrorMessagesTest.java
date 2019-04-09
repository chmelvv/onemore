package LoginForm.Errors;

import Base.BaseTest;
import LoginForm.Elements.Errors;
import org.testng.annotations.Test;

public class ErrorMessagesTest extends BaseTest {

    Errors errors = new Errors();
    StringsAndUserInfo expectedStrings = new StringsAndUserInfo();

    @Test
    public void EmptyFieldsTestFR() {
        Errors errors = new Errors();
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
        //Wrong Username field, password field is empty
            errors.openFR()
                    .openPopin()
                    .userEmail(expectedStrings.getUserIncorrectEmail())
                    .clickSubmitButton()
                    .errorRequredPasswordfield2FR(expectedStrings.getRequredPasswordFiledFR())
                    .errorIncorrectEmailfieldFR(expectedStrings.getWrongCredentialsFR());

        }


        @Test
        public void EmptyPasswordFieldFR() {
            Errors errors = new Errors();
        //Password field is empty
            errors.openFR()
                    .openPopin()
                    .userEmail(expectedStrings.getUserCorrectEmail())
                    .clickSubmitButton()
                    .errorRequredPasswordfield2FR(expectedStrings.getRequredPasswordFiledFR())
                    .errorWrongCredentials1FR(expectedStrings.getWrongCredentialsFR());

        }

        @Test
        public void WrongCredentialsFR() {
            Errors errors = new Errors();
        //Wrong credentials
            errors.openFR()
                    .openPopin()
                    .userEmail(expectedStrings.getUserCorrectEmail())
                    .userPassword(expectedStrings.getUserPassword())
                    .clickSubmitButton()
                    .errorWrongCredentials2FR(expectedStrings.getWrongCredentialsFR());


        }


        @Test
        public void EmptyUsernameFieldFR() {
            Errors errors = new Errors();
        //Username is empty
            errors.openFR()
                    .openPopin()
                    .userPassword(expectedStrings.getUserPassword())
                    .clickSubmitButton()
                    .errorRequredEmailfield2FR(expectedStrings.getRequredEmailFieldFR());

    }

@Test
    public void EmptyFieldsTestEN() {
    Errors errors = new Errors();
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
        //Wrong Username field, password field is empty
        errors.openEN()
                .openPopin()
                .userEmail(expectedStrings.getUserIncorrectEmail())
                .clickSubmitButton()
                .errorRequredPasswordfield2EN(expectedStrings.getRequredPasswordFiledEN())
                .errorIncorrectEmailfieldEN(expectedStrings.getWrongCredentialsEN());

    }


    @Test
    public void EmptyPasswordFieldEN() {
        Errors errors = new Errors();
        //Password field is empty
        errors.openEN()
                .openPopin()
                .userEmail(expectedStrings.getUserCorrectEmail())
                .clickSubmitButton()
                .errorRequredPasswordfield2EN(expectedStrings.getRequredPasswordFiledEN())
                .errorWrongCredentials1EN(expectedStrings.getWrongCredentialsEN());

    }

    @Test
    public void WrongCredentialsEN() {
        Errors errors = new Errors();
        //Wrong credentials
        errors.openEN()
                .openPopin()
                .userEmail(expectedStrings.getUserCorrectEmail())
                .userPassword(expectedStrings.getUserPassword())
                .clickSubmitButton()
                .errorWrongCredentials2EN(expectedStrings.getWrongCredentialsEN());


    }


    @Test
    public void EmptyUsernameFieldEN() {
        Errors errors = new Errors();
        //Username is empty
        errors.openEN()
                .openPopin()
                .userPassword(expectedStrings.getUserPassword())
                .clickSubmitButton()
                .errorRequredEmailfield2EN(expectedStrings.getRequredEmailFieldEN());

    }

}
