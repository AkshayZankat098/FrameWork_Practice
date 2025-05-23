//Step Definition File : Tells what to do based on the step in feature file and calling java methods.

package Stepdefinations;
import Base.BaseClass;
import io.cucumber.java.en.Given;

public class Qkart extends BaseClass {

    @Given("Open Qkart Site")
    public void openSite() {
        qkartPage.openURL("https://crio-qkart-qa.vercel.app/");
    }
}
