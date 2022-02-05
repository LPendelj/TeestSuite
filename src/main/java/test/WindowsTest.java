package test;

import base.BasePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;

public class WindowsTest extends BasePage {

    @BeforeMethod
    public void setUpPage() throws InterruptedException, AWTException {
        // driver.navigate().to("https://demoqa.com/elements");

        homePage.getWindows().click();
        // wdw.wait(2000);


        Thread.sleep(2000);

    }


    @Test
    public void proba(){
        //homePage
    }
}
