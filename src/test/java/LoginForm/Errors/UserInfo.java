package LoginForm.Errors;


import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserInfo {

    private String userCorrectEmail = "test@test100.com";
    private String userIncorrectEmail = "test";
    private String userPassword = "demo1234";

    public String getUserCorrectEmail() {
        return userCorrectEmail;
    }

    public void setUserCorrectEmail(String userCorrectEmail) {
        this.userCorrectEmail = userCorrectEmail;
    }

    public String getUserIncorrectEmail() {
        return userIncorrectEmail;
    }

    public void setUserIncorrectEmail(String userIncorrectEmail) {
        this.userIncorrectEmail = userIncorrectEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
