package pages;

import base.PageBase;
import static com.codeborne.selenide.Selenide.$;
import static helpers.Locators.getLocator;

public class ProductPage extends PageBase {

    public void setAddProductInCart() {
        //$(getLocator("ProductPage.addProductButton")).shouldBe(visible, Duration.ofSeconds(10)).click();
        $(getLocator("ProductPage.addProductButton")).click();
    }
}
