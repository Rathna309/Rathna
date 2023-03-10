package TestRunner;

/*import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//resources//Feature//TestCase1.feature",glue = {"StepDefinition"})
public class TestRunner {
}*/

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src//test//resources//Feature//TestCase1.feature",glue = {"StepDefinition"},monochrome = true,plugin={"pretty","html:target/cucumberreport/TestCase1.html"})
public class TestRunner extends AbstractTestNGCucumberTests
{

}
