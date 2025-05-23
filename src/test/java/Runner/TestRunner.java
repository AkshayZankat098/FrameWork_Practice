package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;  //
import io.cucumber.testng.CucumberOptions; //
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "B:\\Automation Practice\\InterviewSprint\\WebSite_Automation\\WebSite_Automation\\src\\test\\resource\\features",
        glue = {"Stepdefinations"},
        plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber.json"},
        monochrome = true,
        publish = true)

public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}


