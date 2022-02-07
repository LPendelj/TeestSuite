package test;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.List;

public class FormsTest extends BasePage {

    @BeforeMethod
    public void setUpPage() throws InterruptedException, AWTException {
       // driver.navigate().to("https://demoqa.com/elements");

        List<WebElement> elementsList = driver.findElements(By.className("card-up"));

        elementsList.get(1).click();

        Thread.sleep(2000);

    }

    @Test
    public void verifyFormsAreClickable(){
        WebElement form = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/ul/li/span"));
       // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", form);

        form.click();


    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);

        driver.quit();
    }




}
