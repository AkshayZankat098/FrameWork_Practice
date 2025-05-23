package org.example.YoutubePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YouTubeAutomation extends BaseTest {

    WebDriver driver;

    String YouTubeURL = "https://www.youtube.com/";
    @FindBy(xpath = "//a[@id='endpoint' and @title='Movies']")
    WebElement OptionSelect;

    public YouTubeAutomation(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openYouTube() throws InterruptedException {

    }
}
