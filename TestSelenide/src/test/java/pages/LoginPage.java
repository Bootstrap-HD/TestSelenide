package pages;

import base.PageBase;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends PageBase {

    private By emailInput = By.name("email");
    private By passwordInput = By.name("password");
    private By loginButton = By.name("login");
    private By logoutButton = containsText("Logout");

    public void login(String email, String password) {
        $(emailInput).sendKeys(email);
        $(passwordInput).sendKeys(password);
        //$(loginButton).shouldBe(visible, Duration.ofSeconds(10)).click();
        $(loginButton).click();
    }

    public void logout() {
        $(logoutButton).click();
    }
}
