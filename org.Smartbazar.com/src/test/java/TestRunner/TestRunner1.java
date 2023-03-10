package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src//test//resources//Feature//TestCase2.feature",glue = {"StepDefinition"},monochrome = true,plugin={"pretty","html:target/cucumberreport/TestCase2.html"})
public class TestRunner1 extends AbstractTestNGCucumberTests {

}
