package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver givenDriver) {
        super(givenDriver);
    }
    By emailField = By.cssSelector("input[type='email']");
    By passwordField = By.cssSelector("input[type='password']");
    By submit = By.cssSelector("button[type='submit']");
    public void provideEmail(String email) {
        findElement(emailField).sendKeys(email);

    }

    public void providePassword(String password) {
        findElement(passwordField).sendKeys(password);
    }
    public void submitBtn() {
        findElement(submit).click();
    }
    public void login (){
        provideEmail("rekha.swaminathan@testpro.io");
        providePassword("PHL0a6FA");
        submitBtn();
    }
}
