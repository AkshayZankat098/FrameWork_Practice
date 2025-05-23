//Step Definition File : Tells what to do based on the step in feature file and calling java methods.
package Stepdefinations;

import org.example.PracticeSitePages.LoginPage_POM;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import BaseTest.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends BaseTest {

    public WebDriver driver;
    public LoginPage_POM loginPage = new LoginPage_POM(browser());

    @After
    public void Close() {
        driver.quit();
    }

    @Given("I am on the OpenCart login page or create object")
    public void OpenSite() {
        driver = browser();

        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @Given("I have entered a valid username and password")
    public void Enter_UserName_Password() throws InterruptedException {
        loginPage.enterUsername("student");
        loginPage.enterPassword("Password123");
        Thread.sleep(3000);
    }

    @When("I click on the Submit button")
    public void Click_Submit() throws InterruptedException {
        loginPage.clickSubmitButton();
        Thread.sleep(3000);
    }

    @Then("I should be logged in successfully")
    public void CheckLogin() {
        Assert.assertTrue(loginPage.checkLoginMessage(), "Login message was not as expected.");
        System.out.println("Login message check passed.");
    }

    @Given("Logout done")
    public void LogOut() {
        loginPage.logOut();
    }

}
