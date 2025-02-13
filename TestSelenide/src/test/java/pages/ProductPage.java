package pages;

import base.PageBase;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProductPage extends PageBase {
    public By addProductButton = By.cssSelector(".quantity [name='add_cart_product']");

    public void setAddProductInCart() {
        //$(addProductButton).shouldBe(visible, Duration.ofSeconds(10)).click();
        $(addProductButton).click();
    }
}
