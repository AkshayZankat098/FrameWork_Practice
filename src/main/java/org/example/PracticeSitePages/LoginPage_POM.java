//Page Class (PageFactory class or POM Structure) : Tells how to do it using Selenium actions and java related logics we can write here.
package org.example.PracticeSitePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_POM {

    private WebDriver driver;

    // Page Elements using PageFactory
    @FindBy(id = "username")
    private WebElement userNameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "submit")
    private WebElement submitButton;

    @FindBy(xpath = "//h1[text()='Logged In Successfully']")
    private WebElement loginMessageElement;

    @FindBy(xpath = "//a[text()='Log out']")
    private WebElement logoutLink;

    // Constructor
    public LoginPage_POM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // Initialize WebElements
    }

    // Page Methods/Actions
    public void enterUsername(String username) {
        userNameInput.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public boolean checkLoginMessage() {
        return loginMessageElement.getText().contains("Logged In Successfully");
    }

    public void logOut() {
        logoutLink.click();
    }
}
