package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

/*

        In this page are the main methods and locators: like "SearchField" and "ButtonClick"

*/
public class GoogleHomePageActions extends GoogleHomePage
{


    public GoogleHomePageActions(WebDriver driver)
    {
        super(driver);
    }

     By searchField = By.id("lst-ib");
     By searchButton = By.name("btnK");



    public void enterSearchDataAndClickSearchButton(String data)
    {
        driver.findElement(searchField).sendKeys(data);
        driver.findElement(searchButton).click();
    }


}
