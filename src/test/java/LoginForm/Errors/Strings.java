package LoginForm.Errors;



import lombok.Getter;
import lombok.Setter;

@Getter @Setter

public class Strings {
    private String requredEmailFieldFR = "Le champ Adresse email est requis.";
    private String requredEmailFieldEN = "Mail address field is required.";
    private String requredPasswordFiledFR = "Le champ Mot de passe est requis.";
    private String requredPasswordFiledEN = "Password field is required.";
    private String wrongCredentialsFR = "Nom d'utilisateur ou mot de passe non reconnu.";
    private String wrongCredentialsEN = "Unrecognized username or password. Forgot your password?";


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

}


