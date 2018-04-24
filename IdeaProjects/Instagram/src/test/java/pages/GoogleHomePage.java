package pages;


import org.openqa.selenium.WebDriver;

/*

        At this page is nested - "www.google.com"

*/
public class GoogleHomePage
{

    public WebDriver driver;

    public GoogleHomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void goToGoogleHomePage()
    {

        String homePage = "http://www.google.com";
        driver.get(homePage);

    }

}
