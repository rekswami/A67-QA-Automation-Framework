import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework21 extends BaseTest{
    String newPlaylistName = "Homework21 Playlist";

    @Test
    public void renamePlaylist(){
        String updatedPlaylistMsg = "Updated playlist \"Homework21 Playlist.\"";

        provideEmail("rekha.swaminathan@testpro.io");
        providePassword("PHL0a6FA");
        submitBtn();
        doubleClickPlaylist();
        enterNewPlaylistName();
        Assert.assertEquals(getRenamePlaylistSuccessMsg(),updatedPlaylistMsg);
    }
    public void doubleClickPlaylist()
    {
        WebElement newPlaylistElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".playlist:nth-child(4)")));
        action.doubleClick(newPlaylistElement).perform();
     }

     public void enterNewPlaylistName() {
         WebElement playlistInputField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name='name']")));
      //   playlistInputField.clear();
         playlistInputField.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
         playlistInputField.sendKeys(newPlaylistName);
         playlistInputField.sendKeys(Keys.ENTER);
     }

     public String getRenamePlaylistSuccessMsg()
    {
       WebElement notification = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.success.show")));
       return notification.getText();
    }
}
