package base;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Browsers.SAFARI;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class TestBase {

    String ulrLitecart = "https://litecart.stqa.ru/en/";

    @BeforeMethod
    public void methodSetup() {
        Configuration.browser = SAFARI;
        Configuration.pageLoadTimeout = 10000;
        Configuration.timeout = 10000;
        //Configuration.browserSize = "1920x1080";
        Configuration.browserCapabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

        open(ulrLitecart);
       getWebDriver().manage().window().maximize();
    }

    @AfterMethod
    public void methodTeardown() {
        getWebDriver().quit();
    }
}
