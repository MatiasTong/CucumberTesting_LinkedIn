package testrunners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/linkedinlearning/cucumbercourse/features"},
        glue = {"stepdefinitions"},
        tags ={"@SmokeTest"},
        plugin={"pretty"}
)

public class MenuManagementTest {

}
