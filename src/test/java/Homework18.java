import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework18 extends BaseTest
{
    @Test
    public void playSong() throws InterruptedException
    {
        provideEmail("rekha.swaminathan@testpro.io");
        providePassword("PHL0a6FA");
        submitBtn();
        clickPlay();
        Thread.sleep(2000);
        Assert.assertTrue(isSongPlaying());
    }

    public void clickPlay()
    {
     WebElement playNextButton = driver.findElement(By.xpath("//i[@data-testid='play-next-btn']"));
     WebElement playButton = driver.findElement(By.xpath("//span[@data-testid='play-btn']"));

     playNextButton.click();
     playButton.click();
     }

     public Boolean isSongPlaying()
     {
       WebElement soundBar = driver.findElement(By.xpath("//div[@data-testid='sound-bar-play']"));
       return soundBar.isDisplayed();
     }

}
