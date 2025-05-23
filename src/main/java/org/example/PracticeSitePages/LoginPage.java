//Page Class (PageFactory class or POM Structure) : Tells how to do it using Selenium actions and java related logics we can write here.
package org.example.PracticeSitePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;

    // By Locators
    private By UserNameInput = By.xpath("//input[@id='username']");
    private By passwordInput = By.xpath("//input[@id='password']");
    private By SubmitButton = By.xpath("//button[@id='submit']");

// Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

// Page Methods/Actions
    public void enterUsername (String Username) {
        WebElement UserInput = driver.findElement(UserNameInput);
        UserInput.sendKeys(Username);
    }

    public void enterPassword(String password) {
        WebElement Password = driver.findElement(passwordInput);
        Password.sendKeys(password);
    }

    public void clickSubmitButton () {
        WebElement Submit = driver.findElement(SubmitButton);
        Submit.click();
    }

    public boolean CheckLogin_Message (){
        WebElement loginMessageElement = driver.findElement(By.xpath("//h1[text()='Logged In Successfully']"));
        String loginMessage = loginMessageElement.getText();
        return loginMessage.contains("Logged In Successfully");
    }

    public void LogOut_Done (){
        WebElement logout = driver.findElement(By.xpath("//a[text()='Log out']"));
        logout.click();
    }



}
