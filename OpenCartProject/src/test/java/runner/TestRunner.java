package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = {"stepDefinitions", "hooks"},
    publish = true,
    plugin = {"pretty", "html:target/CucumberReports/CucumberReportNEW.html"}
)
public class TestRunner {
    // Leave this class empty
}
