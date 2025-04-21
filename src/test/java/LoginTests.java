import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pagefactory.HomePage;
import pagefactory.LoginPage;


import java.time.Duration;

import static java.sql.DriverManager.getDriver;

public class LoginTests extends BaseTest {
    @Test
    public void loginValidEmailPassword() {
            LoginPage loginPage = new LoginPage(getDriver());
            HomePage homePage = new HomePage(getDriver());
            loginPage.provideEmail("rekha.swaminathan@testpro.io").providePassword("PHL0a6FA").submitBtn();
            Assert.assertTrue(homePage.getAvatarIcon().isDisplayed());


        }

        @Test
        public void loginInvalidEmailPassword() {
            String url = "https://qa.koel.app/";
            LoginPage loginPage = new LoginPage(getDriver());
            loginPage.provideEmail("invalid@testpro.io").providePassword("vReT57X$ym").submitBtn();
            Assert.assertEquals(getDriver().getCurrentUrl(), url);
        }
    }
