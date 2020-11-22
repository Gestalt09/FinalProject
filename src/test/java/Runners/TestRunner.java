package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@SmokeTest",
        features = "src/test/resources",
        glue = {"Steps"},
        plugin = {"pretty"}
        )

public class TestRunner {

}

