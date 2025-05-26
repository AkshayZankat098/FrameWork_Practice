package BaseTest;

import org.example.PracticeSitePages.LoginPage_POM;
import org.example.PracticeSitePages.Qkart_POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

    public static WebDriver driver;
    public static LoginPage_POM loginPage;
    public static Qkart_POM Qkart;

    public void initializeBrowserAndPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Navigate and initialize page
        loginPage = new LoginPage_POM(driver);
        Qkart = new Qkart_POM(driver);
    }

    public void CloseBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

}
