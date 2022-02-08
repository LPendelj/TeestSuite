package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import page.*;

import java.io.IOException;
import java.time.Duration;

public class BasePage {
   public WebDriver driver;
   public WebDriverWait wdw;
   public HomePage homePage;
   public ElementsPage elementsPage;
   public TextBoxPage textBoxPage;
   public FormsPage formsPage;
   public CheckBox checkBox;
   public LibraryPage libraryPage;
   public WidgetsPage widgetsPage;

    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        wdw = new WebDriverWait(driver, Duration.ofSeconds(15));

        homePage = new HomePage(driver);
        elementsPage = new ElementsPage(driver);
        textBoxPage = new TextBoxPage(driver);
        formsPage = new FormsPage(driver);
        checkBox = new CheckBox(driver);
        libraryPage = new LibraryPage(driver);
        widgetsPage = new WidgetsPage(driver);



        ExcelReader er = new ExcelReader("C:\\Users\\Acer\\IdeaProjects\\QaProjekat\\src\\main\\resources\\Data.xlsx");
        driver.manage().window().maximize();
        driver.navigate().to(new String(er.getStringData("URL", 1, 0)));

    }

    /*public void scroll(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }*/




}
