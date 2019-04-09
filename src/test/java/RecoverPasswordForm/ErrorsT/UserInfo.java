package RecoverPasswordForm.ErrorsT;

public class UserInfo {

    private String invalidFieldError = "test";
    private String nonexistentEmail = "nonexistent@email.com";

    public String getInvalidFieldError() {
        return invalidFieldError;
    }

    public void setInvalidFieldError(String invalidFieldError) {
        this.invalidFieldError = invalidFieldError;
    }

    public String getNonexistentEmail() {
        return nonexistentEmail;
    }

    public void setNonexistentEmail(String nonexistentEmail) {
        this.nonexistentEmail = nonexistentEmail;
    }
}
