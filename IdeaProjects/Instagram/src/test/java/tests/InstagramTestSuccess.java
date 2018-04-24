package tests;

import org.testng.annotations.Test;
import pages.*;

/*

    in this InstagramTestSuccess we are performing all activities:
            Open www.google.com; Enter www.instagram.com and click searchButton

*/
public class InstagramTestSuccess extends BaseTest
{
    @Test(priority = 1)
    public void successfullyLoggedInstgramUser()
    {
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);
        googleHomePage.goToGoogleHomePage();

        GoogleHomePageActions googleHomePageActions = new GoogleHomePageActions(driver);
        googleHomePageActions.enterSearchDataAndClickSearchButton("www.instagram.com");

        InstagramSearchPage instagramSearchPage = new InstagramSearchPage(driver);
        instagramSearchPage.VerifyInstagramSearch();

        InstagramSignInPage instagramSignInPage = new InstagramSignInPage(driver);
        instagramSignInPage.clickOnTheInstagramLogInButton();

        InstagramLogInPage instagramLogInPage = new InstagramLogInPage(driver);
        instagramLogInPage.enteringLoginAndPasswordDataAndClickingLogInButton("YourLogin","YourPassword");
        instagramLogInPage.assertingThatWeHaveLoggedIn();

    }
}
