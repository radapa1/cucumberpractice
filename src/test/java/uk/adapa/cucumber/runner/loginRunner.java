package uk.adapa.cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/checkicon.feature",
     //   features = "src/test/resources/features",
        glue = {"uk.adapa.cucumber"},
        plugin = {
                "pretty",
                "html: Login_Test.html",
                "summary"},
        strict = true
)

public class



loginRunner extends AbstractTestNGCucumberTests {
}
