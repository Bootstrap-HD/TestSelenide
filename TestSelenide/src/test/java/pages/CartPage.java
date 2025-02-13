package pages;

import base.PageBase;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CartPage extends PageBase {

    public By textCartButton = By.cssSelector("span.quantity");
    public By cartButton = By.cssSelector("a.content");

    public void goToCart() {
        $(cartButton).shouldBe(visible, Duration.ofSeconds(10)).click();
    }

    public void validateText(String text) {
        $(textCartButton).shouldHave(text(text));
    }

    public void validateElementText(String text) {
        $(containsText(text)).shouldHave((text(text)));
    }

}
