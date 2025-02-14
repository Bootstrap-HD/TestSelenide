package pages;

import base.PageBase;
import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static helpers.Locators.getLocator;

public class CatalogPage extends PageBase {

    public void catalogElementClick(String text) {
        //$(getLocator("CatalogPage.catalogElementP5")).shouldBe(visible, Duration.ofSeconds(10)).click();
        $(getLocator("CatalogPage.catalogElementP5")).click();
    }

    public void validateProductQuantity(int quantity) {
        $$(getLocator("CatalogPage.elementsCatalogLi")).should(size(quantity));
    }
}
