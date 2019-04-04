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
        errors
                .openFR()
                .submitForm()
                .requredFieldsFR();

    }



    @Test
    public void wrongEmailErrorFR(){
        errors
                .openFR()
                .invalidEmailField()
                .submitForm()
                .invalidEmailErrorFR();


    }


    @Test
    public void errorsEN(){
        errors
                .openEN()
                .submitForm()
                .requredFieldsEN();
    }

    @Test
    public void wrongEmailErrorEN(){
        errors
                .openEN()
                .invalidEmailField()
                .submitForm()
                .invalidEmailErrorEN();


    }


}
