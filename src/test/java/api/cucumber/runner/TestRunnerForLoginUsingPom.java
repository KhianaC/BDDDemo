package api.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
       /* features =  "src/test/java/api/cucumber/runner/TestRunnerForLoginUsingPom.java",
        glue = "Steps",
        monochrome = true,
          plugin = {"pretty", "html:target/cucumber-report.html",
                  "pretty", "json:target/cucumber-report.json",
        "pretty", "junit:target/cucumber-report.xml"}*/

        features = "src/test/java/api/cucumber/features/LoginDemo.feature",
        glue = "Steps",
        monochrome = true,
        plugin = {
                "pretty",
                "html:target/cucumber-report.html",
                "json:target/cucumber-report.json",
                "junit:target/cucumber-report.xml"
        }
)
public class TestRunnerForLoginUsingPom {
}




