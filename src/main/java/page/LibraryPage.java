package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryPage {

    public LibraryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "searchBox")
    WebElement searchBox;

    @FindBy(css = ".mr-2")
    WebElement knjiga;


    public WebElement getSearchBox() {
        return searchBox;
    }

    public WebElement getKnjiga(){
        return knjiga;
    }
}
