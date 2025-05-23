//Page Class (PageFactory class or POM Structure) : Tells how to do it using Selenium actions and java related logics we can write here.
package org.example.PracticeSitePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Qkart_POM {

    private WebDriver driver;

    // Page Elements using PageFactory
    @FindBy(id = "username")
    private WebElement userNameInput;

    // Constructor
    public Qkart_POM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Page Actions
    public void openURL(String URL) {
        driver.get(URL);
    }
}
