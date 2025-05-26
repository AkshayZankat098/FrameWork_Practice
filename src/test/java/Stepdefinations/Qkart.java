package Stepdefinations;

import BaseTest.BaseTest;
import io.cucumber.java.en.Given;

public class Qkart extends BaseTest {

    @Given("Inlize Browser")
    public void openURL() {
        initializeBrowserAndPage();    //Reuse from BaseTest
        driver.get("https://www.google.com/");
        Qkart.Search_InGoogle("Virat");
    }

}
