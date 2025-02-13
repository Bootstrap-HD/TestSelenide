package tests;

import base.TestBase;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CatalogPage;
import pages.HeaderMenuPage;
import pages.ProductPage;

public class CartTest extends TestBase {

    @Test
    public void testCartQuantityItems() {
        HeaderMenuPage headerMenuPage = new HeaderMenuPage();
        CatalogPage catalogPage = new CatalogPage();
        ProductPage productPage = new ProductPage();
        CartPage cartPage = new CartPage();

        headerMenuPage.goToCatalog();
        catalogPage.catalogElementClick("-p-5");
        productPage.setAddProductInCart();
        cartPage.validateText("1");
    }

    @Test
    public void testCartValidateGood() {
        HeaderMenuPage headerMenuPage = new HeaderMenuPage();
        CatalogPage catalogPage = new CatalogPage();
        ProductPage productPage = new ProductPage();
        CartPage cartPage = new CartPage();

        headerMenuPage.goToCatalog();
        catalogPage.catalogElementClick("-p-5");
        productPage.setAddProductInCart();
        cartPage.validateText("1");
        cartPage.goToCart();
        cartPage.validateElementText("[SKU: RD005]");
    }
}
