package com.qascript;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features = "src/test/resources/Features/Login.feature",
                glue = "com.qascript.stepDef",
plugin = {
        "pretty",                           // Console output, nicely formatted
        "html:target/cucumber-reports",    // Generates HTML report in target folder
        "json:target/cucumber.json",       // Generates JSON report
        "junit:target/cucumber.xml"        // Generates JUnit XML report
        }

        )

public class TestRunner {

}
