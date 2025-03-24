import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Homework17 extends BaseTest {
    @Test
    public void addSongToPlaylist() {

        String expectedSongAddedMessage = "Added 1 song into \"Playlist Homework17.\"";
        navigateToPage();
        provideEmail("rekha.swaminathan@testpro.io");
        providePassword("PHL0a6FA");
        submitBtn();
        searchSong("Pluto");
        clickViewAllBtn();
        selectFirstSongResult();
        clickAddToBtn();
        choosePlaylist();
        Assert.assertEquals(getAddToPlaylistSuccessMsg(), expectedSongAddedMessage);
    }


    public void searchSong(String name)  {
        WebElement searchField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type='search']")));
        searchField.sendKeys(name);

    }

    public void clickViewAllBtn() {
        WebElement viewAll = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[data-test='view-all-songs-btn']")));
        viewAll.click();
    }

    public void selectFirstSongResult() {
        WebElement firstSong = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//section[@id='songResultsWrapper']//tr[@class='song-item'][1]")));
        firstSong.click();
    }

    public void clickAddToBtn() {
        WebElement addToButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.btn-add-to")));
        addToButton.click();
    }
    public void choosePlaylist() {
        WebElement playlist = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//section[@id='songResultsWrapper']//li[contains(text(),'Playlist Homework17')]")));
        playlist.click();
    }

    public String getAddToPlaylistSuccessMsg() {
        WebElement notification = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.success.show")));
        return notification.getText();
    }
}