package api.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/api/cucumber/features/postwithparameter.feature",
        glue = "Steps",
        monochrome = true,
      //  plugin = {"pretty", "html:target/cucumber-report.html"}
        //plugin = {"pretty", "json:target/cucumber-report.json"}
         plugin = {"pretty", "junit:target/cucumber-report.xml"},tags = "@SmokeTest"

)
public class PostRunner {
}


