package uk.adapa.cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"uk/adapa/cucumber/runner"},
        plugin = {"pretty", "html: Login_Test.html"},
        strict = true
)

public class RunnerClass extends AbstractTestNGCucumberTests {
}
