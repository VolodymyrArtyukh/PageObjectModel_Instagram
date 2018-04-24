package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class InstagramLogInPage extends GoogleHomePage
{

    public InstagramLogInPage(WebDriver driver)
    {
        super(driver);
    }

    By logInField = By.name("username");
    By passwordField = By.name("password");
    By clickingLogInButton = By.cssSelector("._qv64e");
    By instgramLogoLink = By.linkText("instagramLogoLink");

    public void enteringLoginAndPasswordDataAndClickingLogInButton(String loginData, String passwordData)
    {
        driver.findElement(logInField).sendKeys(loginData);
        driver.findElement(passwordField).sendKeys(passwordData);
        driver.findElement(clickingLogInButton).click();
    }

    public void assertingThatWeHaveLoggedIn()
    {
        driver.findElement(instgramLogoLink);

        Assert.assertEquals(instgramLogoLink,instgramLogoLink);
    }

}
