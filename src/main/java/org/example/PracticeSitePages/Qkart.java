package org.example.PracticeSitePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Qkart {
    private WebDriver driver;

        // Page Elements using PageFactory
    @FindBy(xpath = "//textarea[@class='gLFyf']")
    private WebElement search;


    // Constructor
    public Qkart (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // Initialize WebElements
    }

    // Page Methods/Actions
    public void enter_name(String username) {
        search.sendKeys(username);
    }
}
