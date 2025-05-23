package steps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.HomePage;
import pages.LoginPage;

import java.net.URL;

import static org.testng.Assert.assertTrue;

public class LoginSteps {

    private AppiumDriver<MobileElement> driver;
    private LoginPage loginPage;
    private HomePage homePage;

    @Given("que o usuário abre o app do Mercado Livre")
    public void que_o_usuário_abre_o_app_do_Mercado_Livre() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("app", System.getProperty("user.dir") + "/app/mercadolivre.apk");

        driver = new AppiumDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }

    @When("ele informa o login e senha")
    public void ele_informa_o_login_e_senha() {
        loginPage.login("usuario_teste@exemplo.com", "senha123");
    }

    @When("clica no botão de login")
    public void clica_no_botão_de_login() {
        // Ação já realizada dentro do método login
    }

    @Then("ele deve ver a tela inicial do aplicativo")
    public void ele_deve_ver_a_tela_inicial_do_aplicativo() {
        assertTrue(homePage.isHomeDisplayed());
        driver.quit();
    }
}
