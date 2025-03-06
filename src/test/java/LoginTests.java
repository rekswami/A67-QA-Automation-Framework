import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {
    @Test
    public void loginEmptyEmailPassword() throws InterruptedException {
    provideEmail("demo.test pro.io");
    providePassword("");
    clickLoginBtn();
    Thread.sleep(2000);
    Assert.assertEquals(driver.getCurrentUrl(), Url);
    }
}
