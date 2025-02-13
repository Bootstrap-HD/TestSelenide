package pages;

import base.PageBase;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HeaderMenuPage extends PageBase {

    private By catalogButton = By.cssSelector("#site-menu [href='https://litecart.stqa.ru/en/rubber-ducks-c-1/']");

    public void goToCatalog() {
        //$(catalogButton).shouldBe(visible, Duration.ofSeconds(20)).click();
        $(catalogButton).click();
    }
}
