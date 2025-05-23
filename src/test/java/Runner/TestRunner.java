package Runner;

import org.testng.annotations.DataProvider;  //

import io.cucumber.testng.AbstractTestNGCucumberTests; //
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "B:\\Akshay Automation\\Automation Projects\\FrameWork_Practice\\FrameWork_Practice\\src\\test\\resource\\features\\Qkart.feature",
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
