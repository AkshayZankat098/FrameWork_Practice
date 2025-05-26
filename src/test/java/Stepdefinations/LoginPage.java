//Step Definition File : Tells what to do based on the step in feature file and calling java methods.
package Stepdefinations;

import org.testng.Assert;

import BaseTest.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends BaseTest {

    @Given("I am on the OpenCart login page or create object")
    public void openSite() {
        initializeBrowserAndPage();    //Reuse from BaseTest
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @Given("I have entered a valid username and password")
    public void enterUserNamePassword() throws InterruptedException {
        loginPage.enterUsername("student");
        loginPage.enterPassword("Password123");
        Thread.sleep(3000); // For demo only, use waits in real framework
    }

    @When("I click on the Submit button")
    public void clickSubmit() throws InterruptedException {
        loginPage.clickSubmitButton();
        Thread.sleep(3000);
    }

    @Then("I should be logged in successfully")
    public void checkLogin() {
        Assert.assertTrue(loginPage.checkLoginMessage(), "Login message was not as expected.");
        System.out.println("Login message check passed.");
    }

    @Given("Logout done")
    public void logOut() {
        loginPage.logOut();
        driver.quit();  // Quit browser after logout
    }
}
