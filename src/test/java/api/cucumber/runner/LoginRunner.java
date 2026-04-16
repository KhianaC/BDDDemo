package api.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.time.temporal.ChronoUnit;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/api/cucumber/features/LoginDemo.feature",
        glue = {"Steps","api.cucumber.hooks"},
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber-report.html"}

)
public class LoginRunner {
}
