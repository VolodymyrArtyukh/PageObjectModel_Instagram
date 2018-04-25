package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
       String instagramLogoLink = "Instagram";
       WebElement instagramLogo = driver.findElement(By.linkText(instagramLogoLink));       

       if (instagramLogo.isDisplayed())                     
       {
           System.out.println("You have successfully logged to your instagram home page");
       }
       else
       {
           System.out.println("You haven't entered wrong credentials");}
       }
    }   

}
