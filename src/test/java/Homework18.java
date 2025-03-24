import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework18 extends BaseTest
{
    @Test
    public void playSong()
    {
        provideEmail("rekha.swaminathan@testpro.io");
        providePassword("PHL0a6FA");
        submitBtn();
        clickPlay();
        Assert.assertTrue(isSongPlaying());
    }

    public void clickPlay()
    {

        WebElement play = driver.findElement(By.cssSelector("[data-testid='play-btn']"));
        action.moveToElement(play).perform();
        WebElement playNextButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@data-testid='play-next-btn']")));
        playNextButton.click();
        WebElement playButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-testid='play-btn']")));
        playButton.click();

    }

    public Boolean isSongPlaying()
   {
        WebElement soundBar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-testid='sound-bar-play']")));
        return soundBar.isDisplayed();
    }

}