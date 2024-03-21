package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
plugin = {"pretty", "html:target/HTMLREPORTS/report.html",
		  "pretty", "junit:target/JUNITREPORTS/report.xml",
		  "pretty", "json:target/JSONREPORTS/report.json"},

tags= "@registerNewUser",

features="src/test/resources/Features", 
glue= {"StepDefinitions"})

public class TestRunner {

}

