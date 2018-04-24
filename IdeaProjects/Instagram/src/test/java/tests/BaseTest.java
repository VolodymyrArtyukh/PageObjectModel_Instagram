package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

/*

    in BaseTest - here is the main setUp for our page: Chrome Browser and his activities

*/
public class BaseTest
{
    public WebDriver driver;

    @BeforeClass
    public void setUp()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown() throws InterruptedException
    {

        Thread.sleep(5000);
        if (driver != null)
        {
            driver.quit();
        }

    }

}
