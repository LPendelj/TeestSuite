package page;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsPage {
   /* public WebDriver driver;
    public WebDriverWait wd;*/


    public ElementsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "item-0")
    WebElement textBox;

    @FindBy(id = "item-1")
    WebElement checkBox;

    @FindBy(id = "item-2")
    WebElement radioButton;

    @FindBy(id = "item-3")
    WebElement webTables;

    @FindBy(id = "item-4")
    WebElement buttons;

    @FindBy(id = "item-5")
    WebElement links;

    @FindBy(id = "item-6")
    WebElement brokenLinks;

    @FindBy(id = "item-7")
    WebElement load;

    @FindBy(id = "item-8")
    WebElement din;

    //driver.findElement(By.cssSelector("[src=' ']")

   // WebElement dynamic =


    public WebElement getTextBox() {
        return textBox;
    }

    public WebElement getCheckBox() {
        return checkBox;
    }

    public WebElement getRadioButton() {
        return radioButton;
    }

    public WebElement getWebTables() {
        return webTables;
    }

    public WebElement getButtons() {
        return buttons;
    }

    public WebElement getLinks() {
        return links;
    }

    public WebElement getBrokenLinks() {
        return brokenLinks;
    }

    public WebElement getLoad() {
        return load;
    }

    public WebElement getDin() {
        return din;
    }
}
