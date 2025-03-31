import POM.HomePage;
import POM.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;



public class LoginTests extends BaseTest {
    @Test
    public void loginEmptyEmailPassword() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        loginPage.login();
        Assert.assertTrue(homePage.getAvatarIcon().isDisplayed());

    }
}
