package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage extends BasePage {
    public HomePage(WebDriver givenDriver) {
        super(givenDriver);
    }
    By userAvatarIcon = By.cssSelector("img.avatar");
    By playlist = By.cssSelector(".playlist:nth-child(4)");
    By playlistInputField = By.cssSelector("[name='name']");
    By renameMsg = By.cssSelector("div.success.show");
    public WebElement getAvatarIcon(){
        return findElement(userAvatarIcon);
    }
    public void doubleClickOnPlaylist (){
        doubleClick(playlist);
    }
    public void enterNewNameForPlaylist(String playlistName){
        findElement(playlistInputField).sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
        findElement(playlistInputField).sendKeys(playlistName);
        findElement(playlistInputField).sendKeys(Keys.ENTER);
    }

    public String getRenamePlaylistSuccessMsg() {
        return findElement(renameMsg).getText();
    }

}
