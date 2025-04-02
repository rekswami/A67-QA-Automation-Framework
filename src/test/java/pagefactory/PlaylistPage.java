package pagefactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlaylistPage extends BasePage {
    @FindBy(css = "button.del")
    WebElement deleteBtn;
    public PlaylistPage (WebDriver givenDriver){super(givenDriver);}
    public PlaylistPage deletePlaylist(){
        deleteBtn.click();
        deleteBtn.sendKeys(Keys.ENTER);
        return this;
    }
}
