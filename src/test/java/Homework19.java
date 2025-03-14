import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework19 extends BaseTest {
    @Test
    public void deletePlaylist() throws InterruptedException {
        String expectedDeletedPlaylistMessage = "Deleted playlist \"Playlist Homework19.\"";
        provideEmail("rekha.swaminathan@testpro.io");
        providePassword("PHL0a6FA");
        submitBtn();
        findPlaylist();
        Assert.assertEquals(getDeletedPlaylistMsg(), expectedDeletedPlaylistMessage);
    }

    public void findPlaylist() throws InterruptedException {
        WebElement playlistName = driver.findElement(By.xpath("//*[@id='playlists'] //a[contains(text(),'Playlist Homework19')]"));
        playlistName.click();
        WebElement deletePlaylistBtn = driver.findElement(By.cssSelector("button.del"));
        deletePlaylistBtn.click();
        Thread.sleep(2000);
    }

    public String getDeletedPlaylistMsg() {
        WebElement deleteMsg = driver.findElement(By.cssSelector("div.success.show"));
        return deleteMsg.getText();
    }
}
