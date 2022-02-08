package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WidgetsPage {

    public WidgetsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(className = ".card-header")
    WebElement accordion;


    public WebElement getAccordion() {
        return accordion;
    }
}
