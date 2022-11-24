package uk.adapa.multiple.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/multiplefeatures",
        glue = {"uk/adapa/multiple/stepdefs"},
       tags = {"@E2E"}
      //  plugin = {"prety"}

)

public class MultipleRunner extends AbstractTestNGCucumberTests {

}
