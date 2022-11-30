package Stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//cucumber option help url https://testingneeds.wordpress.com/tag/cucumberoptions/

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = { "Stepdefinitions" }, monochrome = true, plugin = {
		"pretty", "html:target/HtmlReports.html" }, tags = "@googlesearchwithoutparamter")
public class TestRunner {

}
