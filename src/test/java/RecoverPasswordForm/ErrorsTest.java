package RecoverPasswordForm;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.codeborne.selenide.Selenide;

public class ErrorsTest extends BaseTest {

    Errors errors = new Errors();

    @Test
    public void requredFieldErrorFR(){
        Errors errors = new Errors();

        errors
                .openFR()
                .openLoginPopinFR()
                .getPopinFR()
                .checkPopinOpenedFR()
                .clickButton()
                .requredFieldErrorFR();
    }

    @Test
    public void requredFieldErrorEN(){
        Errors errors = new Errors();

        errors
                .openEN()
                .openLoginPopinEN()
                .getPopinEN()
                .checkPopinOpenedEN()
                .clickButton()
                .requredFieldErrorEN();
    }

    @Test
    public void invalidEmailErrorFR(){
        Errors errors = new Errors();
        errors
                .openFR()
                .openLoginPopinFR()
                .getPopinFR()
                .checkPopinOpenedFR()
                .invalidFieldErrorFR();
    }
//
    @Test
    public void invalidEmailErrorEN(){
    Errors errors = new Errors();
    errors
            .openEN()
            .openLoginPopinEN()
            .getPopinEN()
            .checkPopinOpenedEN()
            .invalidFieldErrorEN();
}

    @Test
    public void nonexistentEmailErrorFR(){
        Errors errors = new Errors();
        errors
                .openFR()
                .openLoginPopinFR()
                .getPopinFR()
                .checkPopinOpenedFR()
                .nonexistentEmailFR();

    }
      @Test
    public void nonexistentEmailErrorEN(){
        Errors errors = new Errors();
        errors
                .openEN()
                .openLoginPopinEN()
                .getPopinEN()
                .checkPopinOpenedEN()
                .nonexistentEmailEN();

    }
}
