package RecoverPasswordForm.ErrorsT;

import Base.BaseTest;
import RecoverPasswordForm.Errors;
import org.testng.annotations.Test;

public class ErrorsTest extends BaseTest {

    Errors errors = new Errors();
    Strings strings = new Strings();
    UserInfo userInfo = new UserInfo();

    @Test
    public void requredFieldErrorFR(){
        Errors errors = new Errors();
        Strings strings = new Strings();
        UserInfo userInfo = new UserInfo();


        errors
                .openFR()
                .openLoginPopinFR()
                .getPopinFR()
                .checkPopinOpenedFR(strings.getPopinTitleFR())
                .clickButton()
                .requredFieldErrorFR(strings.getRequredFieldErrorFR());
    }

    @Test
    public void requredFieldErrorEN(){
        Errors errors = new Errors();
        Strings strings = new Strings();
        UserInfo userInfo = new UserInfo();

        errors
                .openEN()
                .openLoginPopinEN()
                .getPopinEN()
                .checkPopinOpenedEN(strings.getPopinTitleEN())
                .clickButton()
                .requredFieldErrorEN(strings.getRequredFieldErrorEN());
    }

    @Test
    public void invalidEmailErrorFR(){
        Errors errors = new Errors();
        Strings strings = new Strings();
        UserInfo userInfo = new UserInfo();

        errors
                .openFR()
                .openLoginPopinFR()
                .getPopinFR()
                .checkPopinOpenedFR(strings.getPopinTitleFR())
                .invalidFieldErrorFR(userInfo.getInvalidFieldError(),strings.getInvalidFieldErrorFR());
    }
//
    @Test
    public void invalidEmailErrorEN(){
        Errors errors = new Errors();
        Strings strings = new Strings();
        UserInfo userInfo = new UserInfo();

    errors
            .openEN()
            .openLoginPopinEN()
            .getPopinEN()
            .checkPopinOpenedEN(strings.getPopinTitleEN())
            .invalidFieldErrorEN(userInfo.getInvalidFieldError(),strings.getInvalidFieldErrorEN());
}

    @Test
    public void nonexistentEmailErrorFR(){
        Errors errors = new Errors();
        Strings strings = new Strings();
        UserInfo userInfo = new UserInfo();
        errors
                .openFR()
                .openLoginPopinFR()
                .getPopinFR()
                .checkPopinOpenedFR(strings.getPopinTitleFR())
                .nonexistentEmailFR(userInfo.getNonexistentEmail(),strings.getNonexistentEmailFR());

    }
      @Test
    public void nonexistentEmailErrorEN(){
        Errors errors = new Errors();
        Strings strings = new Strings();
        UserInfo userInfo = new UserInfo();
        errors
                .openEN()
                .openLoginPopinEN()
                .getPopinEN()
                .checkPopinOpenedEN(strings.getPopinTitleEN())
                .nonexistentEmailEN(userInfo.getNonexistentEmail(),strings.getNonexistentEmailEN());

    }
}
