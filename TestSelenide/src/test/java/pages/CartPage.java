package pages;

import base.PageBase;
import java.time.Duration;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static helpers.Locators.getLocator;

public class CartPage extends PageBase {

    public void goToCart() {
        $(getLocator("CartPage.cartButton")).shouldBe(visible, Duration.ofSeconds(10)).click();
    }

    public void validateText(String text) {
        $(getLocator("CartPage.textCartButton")).shouldHave(text(text));
    }

    public void validateElementText(String text) {
        $(getLocator("CartPage.productArticle")).shouldHave((text(text)));
    }

}
