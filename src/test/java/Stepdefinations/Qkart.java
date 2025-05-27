package Stepdefinations;

import BaseTest.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Qkart extends BaseTest {

    @Given("Initialize Browser")
    public void openURL() {
        initializeBrowserAndPage();    //Reuse from BaseTest
        driver.get("https://crio-qkart-qa.vercel.app/");
    }

    @When("I enter name")
    public void searchName() {
        Qkart.Search_InGoogle();
    }

    @Then("I should be search successfully")
    public void search() {
        Qkart.Click_Search();
        driver.quit();
    }

}
