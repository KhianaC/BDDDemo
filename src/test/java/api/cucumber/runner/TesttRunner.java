package api.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
/*
@RunWith(Cucumber.class)
@CucumberOptions(
        features = " src/test/java/Features",
        glue = {"stepdefinition"},
        plugin = {"pretty", "html:target/cucumber-report.html"},
        monochrome = true
)
public class TesttRunner {
}*/
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = {"api.cucumber"},
        plugin = {"pretty", "html:target/cucumber-report.html"},
        monochrome = true
)
public class TesttRunner {
}