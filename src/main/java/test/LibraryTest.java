package test;

import base.BasePage;
import base.ExcelReader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class LibraryTest extends BasePage {

    @BeforeMethod
    public void setupPage() throws IOException {
        List<WebElement> elementsList = driver.findElements(By.className("card-up"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementsList.get(5));

        elementsList.get(5).click();

        er = new ExcelReader("src/main/resources/Data.xlsx");

    }

    public static ExcelReader er;

    @Test
    public void verifyThatSearchBoxShowsExactResults() throws InterruptedException {

        for(int i =1; i < 5; i++) {
            Thread.sleep(1000);
            String search = er.getStringData("Other", i, 0);

            libraryPage.getSearchBox().clear();

            libraryPage.getSearchBox().sendKeys(search);

            //boolean vidi = libraryPage.getKnjiga().isDisplayed();

            //Assert.assertTrue(vidi);


            Assert.assertTrue(libraryPage.getKnjiga().getText().contains(search));
        }
    }



    @Test
    public void verifyThatClickOnBookRedirectsToCorrectAddress(){
        libraryPage.getSearchBox().sendKeys("git");
        libraryPage.getKnjiga().click();

        String url = "https://demoqa.com/books?book=9781449325862";


        Assert.assertEquals(url, driver.getCurrentUrl());

    }

   // @Test


}
