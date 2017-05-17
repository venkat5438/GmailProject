import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/features/"}, //this is the location of feature file
        //monochrome = true, // this is used to set the console output is much readable
        glue ={"features"} , // this is the location of step definition files
        format = "pretty",  // this is a format in different types of formats for the output reports
        tags ={"@Function"}    // this is like priority of test cases. suppose we have 5 scenarios in our feature.
        // we wanna execute only 3 scenarios priority based.so, we need to mention tags above every scenario.
        // @smoke ..... @login.... @Sanity ...naming conventions are not standards
)
public class GmailRunner {


}

