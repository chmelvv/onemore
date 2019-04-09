package RecoverPasswordForm.ErrorsT;

public class Strings {
    private String requredFieldErrorFR = "Le champ Nom d'utilisateur ou adresse courriel est requis.";
    private String requredFieldErrorEN = "Username or email address field is required.";
    private String invalidFieldErrorFR = "test n'est pas reconnu comme nom d'utilisateur ou adresse de courriel.";
    private String invalidFieldErrorEN = "test is not recognized as a username or an email address.";
    private String nonexistentEmailFR = "nonexistent@email.com n'est pas reconnu comme nom d'utilisateur ou adresse de courriel.";
    private String nonexistentEmailEN = "nonexistent@email.com is not recognized as a username or an email address.";
    private String popinTitleFR = "Réinitialiser votre mot de passe";
    private String popinTitleEN = "Reset your password";

    public String getPopinTitleFR() {
        return popinTitleFR;
    }

    public void setPopinTitleFR(String popinTitleFR) {
        this.popinTitleFR = popinTitleFR;
    }

    public String getPopinTitleEN() {
        return popinTitleEN;
    }

    public void setPopinTitleEN(String popinTitleEN) {
        this.popinTitleEN = popinTitleEN;
    }

    public String getRequredFieldErrorFR() {
        return requredFieldErrorFR;
    }

    public void setRequredFieldErrorFR(String requredFieldErrorFR) {
        this.requredFieldErrorFR = requredFieldErrorFR;
    }

    public String getRequredFieldErrorEN() {
        return requredFieldErrorEN;
    }

    public void setRequredFieldErrorEN(String requredFieldErrorEN) {
        this.requredFieldErrorEN = requredFieldErrorEN;
    }

    public String getInvalidFieldErrorFR() {
        return invalidFieldErrorFR;
    }

    public void setInvalidFieldErrorFR(String invalidFieldErrorFR) {
        this.invalidFieldErrorFR = invalidFieldErrorFR;
    }

    public String getInvalidFieldErrorEN() {
        return invalidFieldErrorEN;
    }

    public void setInvalidFieldErrorEN(String invalidFieldErrorEN) {
        this.invalidFieldErrorEN = invalidFieldErrorEN;
    }

    public String getNonexistentEmailFR() {
        return nonexistentEmailFR;
    }

    public void setNonexistentEmailFR(String nonexistentEmailFR) {
        this.nonexistentEmailFR = nonexistentEmailFR;
    }

    public String getNonexistentEmailEN() {
        return nonexistentEmailEN;
    }

    public void setNonexistentEmailEN(String nonexistentEmailEN) {
        this.nonexistentEmailEN = nonexistentEmailEN;
    }
}
