package Stepdefinations;

import BaseTest.BaseTest;
import io.cucumber.java.en.Given;

public class Qkart extends BaseTest {

    @Given("Open Qkart")
    public void open_Qkart() {
        browser().get("https://google.com");
    }

    // @Given("Search Qkart")
    // public void Search() {
    //     Qkart qk = new Qkart(driver);
    //     enter_name("Virat");
    // }
}
