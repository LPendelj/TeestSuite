package test;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class InteractionTest extends BasePage {

    @BeforeMethod
    public void setupPage(){
        List<WebElement> elementsList = driver.findElements(By.className("card-up"));

        elementsList.get(4).click();
    }


    @Test
    public void proba(){
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, "https://demoqa.com/interaction");
    }
}
