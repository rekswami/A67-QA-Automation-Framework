import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactory.HomePage;
import pagefactory.LoginPage;
import pagefactory.PlaylistPage;

public class Homework23Test extends BaseTest {
    @Test
    public void deletePlaylist(){
        String expectedDeleteMsg = "Deleted playlist \"Playlist 23.\"";
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        PlaylistPage playlistPage = new PlaylistPage(driver);
        loginPage.provideEmail("rekha.swaminathan@testpro.io").providePassword("PHL0a6FA").submitBtn();
        homePage.findPlaylist();
        playlistPage.deletePlaylist();
        Assert.assertEquals(homePage.getDeletePlaylistMsg(), expectedDeleteMsg);

    }
}
