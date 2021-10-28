package runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        features = {"classpath:features"},
        glue = {"stepDefinitions"},
//        tags = "@tags",
        plugin = {
                "pretty",
                "json:build/cucumber-report/cucumber.json",
                "junit:build/cucumber-report/cucumber.xml",
                "html:build/cucumber-report/cucumber.html"
        }
)
public class SerenityCucumberTest {
}
