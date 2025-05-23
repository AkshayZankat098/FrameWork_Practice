package Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.example.PracticeSitePages.Qkart_POM;

public class BaseClass {

    protected WebDriver driver;
    protected Qkart_POM qkartPage;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup(); // Setup driver first
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Initialize Page Object
        qkartPage = new Qkart_POM(driver);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}

