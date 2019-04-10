package NewsletterForm.ErrorsTEST;

import Base.BaseTest;
import NewsletterForm.Errors;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ErrorsTest extends BaseTest {

    Errors errors = new Errors();
    Strings strings = new Strings();
    UserInfo userInfo = new UserInfo();


    @BeforeMethod
    public void logOff(){
        Selenide.clearBrowserCookies();
        }


    @Test
    public void errorsFR(){
        Errors errors = new Errors();
        Strings strings = new Strings();
        UserInfo userInfo = new UserInfo();
        errors
                .openFR()
                .submitForm()
                .requredFieldsFR(strings.getRequredNomFieldFR(),strings.getRequredPrenomFieldFR(),strings.getRequredEmailFieldFR(),strings.getRequredSecteurFieldFR(),strings.getRequredSociétéFieldFR(),
                        strings.getRequredTelFieldFR(),strings.getRequredRulesFieldFR());

    }



    @Test
    public void wrongEmailErrorFR(){
        Errors errors = new Errors();
        Strings strings = new Strings();
        UserInfo userInfo = new UserInfo();
        errors
                .openFR()
                .invalidEmailField(userInfo.getEmailField())
                .submitForm()
                .invalidEmailErrorFR(strings.getInvalidEmailErrorFR());


    }


    @Test
    public void errorsEN(){
        Errors errors = new Errors();
        Strings strings = new Strings();
        UserInfo userInfo = new UserInfo();
        errors
                .openEN()
                .submitForm()
                .requredFieldsEN(strings.getRequredNomFieldEN(),strings.getRequredPrenomFieldEN(),strings.getRequredEmailFieldEN(),strings.getRequredSecteurFieldEN(),strings.getRequredSociétéFieldEN(),
                        strings.getRequredTelFieldEN(),strings.getRequredRulesFieldEN());
    }

    @Test
    public void wrongEmailErrorEN(){
        Errors errors = new Errors();
        Strings strings = new Strings();
        UserInfo userInfo = new UserInfo();
        errors
                .openEN()
                .invalidEmailField(userInfo.getEmailField())
                .submitForm()
                .invalidEmailErrorEN(strings.getInvalidEmailErrorEN());


    }


}
