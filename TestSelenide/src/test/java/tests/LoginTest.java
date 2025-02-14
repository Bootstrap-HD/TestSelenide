package tests;

import base.TestBase;
import org.testng.annotations.Test;
import pages.LoginMessagePage;
import pages.LoginPage;
import static helpers.EnvironmentData.getEnvironmentData;

public class LoginTest extends TestBase {

    @Test
    public void testAutorization() {
        LoginPage loginPage = new LoginPage();
        LoginMessagePage loginMessagePage = new LoginMessagePage();

        loginPage.login(getEnvironmentData("Dev.email"), getEnvironmentData("Dev.password"));

        loginMessagePage.validateMessage(String.format(getEnvironmentData("Dev.loginSuccessMessage"), getEnvironmentData("Dev.name")));
    }

    @Test
    public void testLogOut() {
        LoginPage loginPage = new LoginPage();
        loginPage.login(getEnvironmentData("Dev.email"), getEnvironmentData("Dev.password"));
        LoginMessagePage loginMessagePage = new LoginMessagePage();

        loginPage.logout();

        loginMessagePage.validateMessage(getEnvironmentData("Dev.logoutMessage"));
    }
}
