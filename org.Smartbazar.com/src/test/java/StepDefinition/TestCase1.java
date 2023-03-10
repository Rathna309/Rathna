package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.Browser.Browser;
import org.Pages.Page1;
import org.Screenshorts.Screenshort1;
import org.testng.Assert;
import org.testng.Reporter;

public class TestCase1 {
    @Given("User Opens the Browser")
    public void user_opens_the_browser() {
        Browser.OpenBrowser();
    }
    @Then("User enters the {string}")
    public void user_enters_the(String string) throws InterruptedException {
        Browser.OpenUrl(string);  //URL
    }
    @And("User verifies the title of the application")
    public void user_verifies_the_title_of_the_application() throws Exception {
        Screenshort1.ScreenShot("TestCase1");
            Assert.assertEquals(Page1.getTtitle1(), "https://www.smartbazaar.com/");
    }
        @Then("User close the Browser.")
        public void user_close_the_browser() {
            Browser.CloseBrowser();
        }
    }


