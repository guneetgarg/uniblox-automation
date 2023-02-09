package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = {"StepDefinitions"},
        monochrome = true,
        dryRun = false,
        plugin = {"pretty",
                "html:target/reports",
                "json:target/reports/cucumber.json",
                "junit:target/reports/cucumber.xml"
        }
)
public class TestRunner {

}
