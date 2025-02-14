package pages;

import base.PageBase;
import static com.codeborne.selenide.Selenide.$;
import static helpers.Locators.getLocator;

public class LoginPage extends PageBase {

    public void login(String email, String password) {
        $(getLocator("LoginPage.emailInput")).sendKeys(email);
        $(getLocator("LoginPage.passwordInput")).sendKeys(password);
        //$(getLocator("LoginPage.loginButton")).shouldBe(visible, Duration.ofSeconds(10)).click();
        $(getLocator("LoginPage.loginButton")).click();
    }

    public void logout() {
        $(getLocator("LoginPage.logoutButton")).click();
    }
}
