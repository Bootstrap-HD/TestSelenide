package pages;

import base.PageBase;
import static com.codeborne.selenide.Selenide.$;
import static helpers.Locators.getLocator;

public class HeaderMenuPage extends PageBase {

    public void goToCatalog() {
        $(getLocator("HeaderMenuPage.catalogButton")).click();
    }
}
