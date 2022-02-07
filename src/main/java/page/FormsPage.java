package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormsPage {


    public FormsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "item-0")
    WebElement practiceForm;

    @FindBy(css = ".header-right")
    WebElement alerts;


    public WebElement getPracticeForm() {
        return practiceForm;
    }

    public WebElement getAlerts() {
        return alerts;
    }
}
