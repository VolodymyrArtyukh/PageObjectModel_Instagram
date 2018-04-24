package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/*

    At this page we verify that we are at Instagram Search page and we are clicking on instagram link

 */

public class InstagramSearchPage extends GoogleHomePage
{

    public InstagramSearchPage(WebDriver driver)
    {
        super(driver);
    }

     By instagramLink = By.linkText("Instagram");

    public void VerifyInstagramSearch()
    {

        String actualTitle = driver.getTitle();
        String expecdtedTitle = "www.instagram.com - Szukaj w Google";
        Assert.assertEquals(expecdtedTitle,actualTitle);
        driver.findElement(instagramLink).click();
    }


}
