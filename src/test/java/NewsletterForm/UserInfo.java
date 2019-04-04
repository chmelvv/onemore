package NewsletterForm;

public class UserInfo {

private String userNome = "Kondratieva";
private String userPrenom = "Svitlana";
    private String userEmail = "kondratieva.ua@gmail.com";
    private String userSociété = "SociétéTEST";
    private String userTéléphone = "+380666457082";
    private String userAdresse = "AdresseTEST";
    private String userVille = "VilleTEST";
    private String userCodePostal = "75002";
    private String confirmationMessageFR = "Votre abonnement à la newsletter a été enregistrée.";
    private String confirmationMessageEN = "Your newsletter subscription has been registered.";


    public void setConfirmationMessageFR(String confirmationMessage) {

        this.confirmationMessageFR = confirmationMessage;
    }


    public void setConfirmationMessageEN(String confirmationMessage) {

        this.confirmationMessageEN = confirmationMessage;
    }

    public String getUserNome() {

        return userNome;
    }

    public void setUserNome(String userNome) {
        this.userNome = userNome;
    }

    public String getUserPrenom() {
        return userPrenom;
    }

    public void setUserPrenom(String userPrenom) {
        this.userPrenom = userPrenom;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserSociété() {
        return userSociété;
    }

    public void setUserSociété(String userSociété) {
        this.userSociété = userSociété;
    }

    public String getUserTéléphone() {
        return userTéléphone;
    }

    public void setUserTéléphone(String userTéléphone) {
        this.userTéléphone = userTéléphone;
    }

    public String getUserAdresse() {
        return userAdresse;
    }

    public void setUserAdresse(String userAdresse) {
        this.userAdresse = userAdresse;
    }

    public String getUserVille() {
        return userVille;
    }

    public void setUserVille(String userVille) {
        this.userVille = userVille;
    }

    public String getUserCodePostal() {
        return userCodePostal;
    }

    public void setUserCodePostal(String userCodePostal) {
        this.userCodePostal = userCodePostal;
    }
    public String getConfirmationMessageFR() {
        return confirmationMessageFR;
    }
    public String getConfirmationMessageEN() {
        return confirmationMessageEN;
    }
}
