//Step Definition File : Tells what to do based on the step in feature file and calling java methods.

package Stepdefinations;
import Base.BaseClass;
import io.cucumber.java.en.Given;
import org.example.PracticeSitePages.Qkart_POM;

public class Qkart extends BaseClass {

    @Given("Open Qkart")
    public void openSite() {
        qkartPage.openURL("https://crio-qkart-qa.vercel.app/");
    }
}
