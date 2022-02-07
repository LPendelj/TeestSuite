package test;

import base.BasePage;
import base.ExcelReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;
import java.util.List;

public class BookStoreTest extends BasePage {

    @BeforeMethod
    public void setUpPage() throws InterruptedException, IOException {
        //driver.navigate().to("https://demoqa.com/elements");
        List<WebElement> elementsList = driver.findElements(By.className("card-up"));

        elementsList.get(5).click();
        // wdw.wait(2000);


        Thread.sleep(2000);

       // er = new ExcelReader("src/main/resources/Data.xlsx");
    }

    @Test
    public void proba(){

    }
}
