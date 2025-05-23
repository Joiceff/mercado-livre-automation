package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.HomePage;
import pages.LoginPage;

import java.net.URL;

public class LoginTest {
    private AppiumDriver<MobileElement> driver;
    private LoginPage loginPage;
    private HomePage homePage;

    @BeforeClass
    public void setUp() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("app", System.getProperty("user.dir") + "/app/mercadolivre.apk");

        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }

    @Test
    public void testLoginSuccess() {
        loginPage.login("usuario_teste@exemplo.com", "senha123");
        Assert.assertTrue(homePage.isHomeDisplayed());
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
