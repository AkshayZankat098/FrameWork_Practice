package org.example.PracticeSitePages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Qkart_POM {

    private WebDriver driver;

    // Page Elements using PageFactory
    @FindBy(xpath = "(//input[@name='search'])[1]")
    private WebElement Search;

    // Constructor
    public Qkart_POM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);       // Initialize WebElements
    }

    // Page Methods/Actions
    public void Search_InGoogle() {
        Search.sendKeys("Roadster Mens Running Shoes");
    }

    public void Click_Search() {
        Search.sendKeys(Keys.ENTER);
    }

}
