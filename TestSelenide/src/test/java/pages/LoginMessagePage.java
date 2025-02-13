package pages;

import base.PageBase;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LoginMessagePage extends PageBase {

    public By messageElement = By.cssSelector("#notices>.notice");

    public String loginSuccessMessage = " You are now logged in as %s.";
    public String logoutMessage = " You are now logged out.";

    public void validateMessage(String message) {
        $(messageElement).shouldHave(text(message));
    }
}
