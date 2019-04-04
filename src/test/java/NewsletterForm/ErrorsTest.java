package NewsletterForm;

import NewsletterForm.BaseTest;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.codeborne.selenide.Selenide;

public class ErrorsTest extends BaseTest {

    Errors errors = new Errors();




    @Test
    public void errorsFR(){
        Errors errors = new Errors();
        errors
                .openFR()
                .submitForm()
                .requredFieldsFR();

    }



    @Test
    public void wrongEmailErrorFR(){
        Errors errors = new Errors();
        errors
                .openFR()
                .invalidEmailField()
                .submitForm()
                .invalidEmailErrorFR();


    }


    @Test
    public void errorsEN(){
        Errors errors = new Errors();
        errors
                .openEN()
                .submitForm()
                .requredFieldsEN();
    }

    @Test
    public void wrongEmailErrorEN(){
        Errors errors = new Errors();
        errors
                .openEN()
                .invalidEmailField()
                .submitForm()
                .invalidEmailErrorEN();


    }


}
