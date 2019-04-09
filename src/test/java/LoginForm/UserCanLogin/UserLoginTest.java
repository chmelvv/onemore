package LoginForm.UserCanLogin;

import Base.BaseTest;
import org.testng.annotations.Test;

public class UserLoginTest extends BaseTest {

    MainPage mainPage = new MainPage();

    @Test
    public void userCanLogin(){
        MainPage mainPage = new MainPage();
        User defaultUser = new User();


        mainPage
                .open()
                .loginUser(defaultUser.getUserEmail(), defaultUser.getUserPassword())
                .checkLoggedUserName(defaultUser.getUserName());

    }
}
