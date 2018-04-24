package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InstagramSignInPage extends GoogleHomePage
{
    public InstagramSignInPage(WebDriver driver)
    {
        super(driver);
    }

    By logInLink = By.linkText("Log in");

    public void clickOnTheInstagramLogInButton()
    {
        driver.findElement(logInLink).click();
    }

}
