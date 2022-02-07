package test;

import base.BasePage;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class WindowsTest extends BasePage {


    @BeforeMethod
    public void setUpPage() throws InterruptedException, AWTException {
        // driver.navigate().to("https://demoqa.com/elements");

        List<WebElement> elementsList = driver.findElements(By.className("card-up"));

        elementsList.get(2).click();


        Thread.sleep(2000);

    }

   // List<WebElement> webElements = driver.findElements(By.className("menu-list"));

    @Test
    public void verifyAlertsAreClickable(){
       // List<WebElement> webElements = driver.findElements(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[2]"));
      //  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", webElements.get(0));

        // polje.click();
        WebElement kartica1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[2]"));


        kartica1.click();


        String url = "https://demoqa.com/alerts";
        Assert.assertEquals(url, driver.getCurrentUrl());

      /*  WebElement alert = driver.findElement(By.id("item-1"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", alert);*/
       // formsPage.getAlerts().click();
//        alert.click();
    }

    @Test
    public void verifyAlertClickButtonOpensDialogBox(){
        verifyAlertsAreClickable();

        WebElement button = driver.findElement(By.id("alertButton"));

        button.click();

        boolean alertWorks;



         //   driver.switchTo().alert();


        Assert.assertTrue(isDialogPresent(driver));


    }


    private static boolean isDialogPresent(WebDriver driver) {
        try {
            driver.getTitle();
            return false;
        } catch (UnhandledAlertException e) {
            // Modal dialog showed
            return true;
        }
    }

    @AfterMethod
    public void back() throws InterruptedException {
       // Thread.sleep(2000);
        //driver.quit();
    }
}
