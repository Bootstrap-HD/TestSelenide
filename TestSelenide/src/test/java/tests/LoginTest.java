package tests;

import base.TestBase;
import org.testng.annotations.Test;
import pages.LoginMessagePage;
import pages.LoginPage;

public class LoginTest extends TestBase {

    String email = "vata66@tut.by";
    String password = "123456";
    String name = "Viktar Iliukovich";

    @Test
    public void testAutorization() {
        LoginPage loginPage = new LoginPage();
        LoginMessagePage loginMessagePage = new LoginMessagePage();

        loginPage.login(email, password);

        loginMessagePage.validateMessage(String.format(loginMessagePage.loginSuccessMessage, name));
    }

    @Test
    public void testLogOut() {
        LoginPage loginPage = new LoginPage();
        loginPage.login(email, password);
        LoginMessagePage loginMessagePage = new LoginMessagePage();

        loginPage.logout();

        loginMessagePage.validateMessage(loginMessagePage.logoutMessage);
    }
}
