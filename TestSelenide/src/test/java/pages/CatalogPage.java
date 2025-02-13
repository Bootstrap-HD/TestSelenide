package pages;

import base.PageBase;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CatalogPage extends PageBase {

    private By elementsCatalogLi = By.cssSelector("ul.products li");

    public By getCatalogElementSelector(String text) {
        return By.cssSelector(String.format("#box-category .listing-wrapper.products a[href*='%s']",text));
    }

    public void catalogElementClick(String text) {
        //$(getCatalogElementSelector(text)).shouldBe(visible, Duration.ofSeconds(10)).click();
        $(getCatalogElementSelector(text)).click();
    }

    public void validateProductQuantity(int quantity) {
        $$(elementsCatalogLi).should(size(quantity));
    }
}
