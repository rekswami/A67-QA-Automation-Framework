import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Homework19 extends BaseTest {
    @Test
    public void deletePlaylist() {
        String expectedDeletedPlaylistMessage = "Deleted playlist \"Playlist Homework19.\"";
        provideEmail("rekha.swaminathan@testpro.io");
        providePassword("PHL0a6FA");
        submitBtn();
        findPlaylist();
        Assert.assertEquals(getDeletedPlaylistMsg(),expectedDeletedPlaylistMessage);
    }
    public void findPlaylist() {
        WebElement playlistName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='playlists'] //a[contains(text(),'Playlist Homework19')]")));
        playlistName.click();
        WebElement deletePlaylistBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.del")));
        deletePlaylistBtn.click();

    }
    public String getDeletedPlaylistMsg() {
        WebElement deleteMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.success.show")));
        return deleteMsg.getText();
    }
}