package pages;

import base.PageBase;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static helpers.Locators.getLocator;

public class LoginMessagePage extends PageBase {

    public void validateMessage(String message) {
        $(getLocator("LoginMessagePage.messageElement")).shouldHave(text(message));
    }
}
