package tests;

import base.TestBase;
import org.testng.annotations.Test;
import pages.CatalogPage;
import pages.HeaderMenuPage;

public class CatalogTest extends TestBase {

    @Test
    public void testCatalogQuantityGoods() {
        HeaderMenuPage headerMenuPage = new HeaderMenuPage();
        headerMenuPage.goToCatalog();

        CatalogPage catalogPage = new CatalogPage();

        catalogPage.validateProductQuantity(5);
    }
}
