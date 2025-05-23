//Step Definition File : Tells what to do based on the step in feature file and calling java methods.
package Stepdefinations;

import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {

    private WebDriver driver;
    private org.example.PracticeSitePages.LoginPage loginPage;

    @Before
    public void setup() {
        driver = new ChromeDriver();
    }

    @After
    public void Close(){
        driver.quit();
    }

    @Given("I am on the OpenCart login page or create object")
    public void OpenSite () {

        //Create object of login page         And     //Call Constructor
        loginPage = new org.example.PracticeSitePages.LoginPage(driver);
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();
    }

    @Given("I have entered a valid username and password")
    public void Enter_UserName_Password () throws InterruptedException {
        loginPage.enterUsername("student");
        loginPage.enterPassword("Password123");
        Thread.sleep(3000);
    }

    @When("I click on the Submit button")
    public void Click_Submit () throws InterruptedException {
        loginPage.clickSubmitButton ();
        Thread.sleep(3000);
    }

    @Then("I should be logged in successfully")
    public void CheckLogin () {
        Assert.assertTrue(loginPage.CheckLogin_Message(), "Login message was not as expected.");
        System.out.println("Login message check passed.");
    }

    @Given("Logout done")
    public void LogOut(){
        loginPage.LogOut_Done();
    }

}
