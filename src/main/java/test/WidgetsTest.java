package test;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class WidgetsTest extends BasePage {


    @BeforeMethod
    public void setupPage(){
        List<WebElement> elementsList = driver.findElements(By.className("card-up"));

        elementsList.get(3).click();



    }

    @Test
    public void verifyWidgetIsLoaded(){
        List<WebElement> menuList = driver.findElements(By.cssSelector(".element-list.collapse.show"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[3]/span/div/div[1]")));

        menuList.get(0).click();
        //WebElement we = driver.findElement(By.id("item-0"));


    }


    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);

        driver.quit();
    }
}
