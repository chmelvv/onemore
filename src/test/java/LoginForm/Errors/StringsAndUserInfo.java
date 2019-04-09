package LoginForm.Errors;


import LoginForm.Elements.Strings;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter

public class StringsAndUserInfo {
    private String requredEmailFieldFR = "Le champ Adresse email est requis.";
    private String requredEmailFieldEN = "Mail address field is required.";
    private String requredPasswordFiledFR = "Le champ Mot de passe est requis.";
    private String requredPasswordFiledEN = "Password field is required.";
    private String wrongCredentialsFR = "Nom d'utilisateur ou mot de passe non reconnu.";
    private String wrongCredentialsEN = "Unrecognized username or password. Forgot your password?";
    private String userCorrectEmail = "test@test100.com";
    private String userIncorrectEmail = "test";
    private String userPassword = "demo1234";

    public String getRequredEmailFieldFR() {
        return requredEmailFieldFR;
    }

    public void setRequredEmailFieldFR(String requredEmailFieldFR) {
        this.requredEmailFieldFR = requredEmailFieldFR;
    }

    public String getRequredEmailFieldEN() {
        return requredEmailFieldEN;
    }

    public void setRequredEmailFieldEN(String requredEmailFieldEN) {
        this.requredEmailFieldEN = requredEmailFieldEN;
    }

    public String getRequredPasswordFiledFR() {
        return requredPasswordFiledFR;
    }

    public void setRequredPasswordFiledFR(String requredPasswordFiledFR) {
        this.requredPasswordFiledFR = requredPasswordFiledFR;
    }

    public String getRequredPasswordFiledEN() {
        return requredPasswordFiledEN;
    }

    public void setRequredPasswordFiledEN(String requredPasswordFiledEN) {
        this.requredPasswordFiledEN = requredPasswordFiledEN;
    }

    public String getWrongCredentialsFR() {
        return wrongCredentialsFR;
    }

    public void setWrongCredentialsFR(String wrongCredentialsFR) {
        this.wrongCredentialsFR = wrongCredentialsFR;
    }

    public String getWrongCredentialsEN() {
        return wrongCredentialsEN;
    }

    public void setWrongCredentialsEN(String wrongCredentialsEN) {
        this.wrongCredentialsEN = wrongCredentialsEN;
    }

    public String getUserCorrectEmail() {
        return userCorrectEmail;
    }

    public void setUserCorrectEmail(String userCorrectEmail) {
        this.userCorrectEmail = userCorrectEmail;
    }

    public String getUserIncorrectEmail() {
        return userIncorrectEmail;
    }

    public void setUserIncorrectEmail2(String userIncorrectEmail) {
        this.userIncorrectEmail = userIncorrectEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}


