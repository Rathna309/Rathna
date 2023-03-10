package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.Pages.Page1;
import org.Pages.Page2;
import org.Pages.Page3;
import org.Screenshorts.Screenshort1;
import org.testng.Assert;

public class TestCase2 {
    @And("User enters the {string} data")
    public void user_enters_the_data(String string) {
        Page1.SearchBox(string);

    }
    @Then("user click on the search icon")
    public void user_click_on_the_search_icon() {
        Page1.ClickEnter();
    }
    @Then("User verifies the {string} results")
    public void user_verifies_the_results(String string) throws Exception {
        try{
            Thread.sleep(4000);
            Screenshort1.ScreenShot(string);
            Assert.assertEquals(Page2.SaveText(),string);
        }catch(AssertionError e){
            System.out.println(e);
        }

    }
    @When("User selects the {string} product")
    public void user_selects_the_product(String string) throws InterruptedException {
        Page2.SelectProduct(string);
    }
    @And("User verifies the {string} product result")
    public void user_verifies_the_product_result(String string) throws InterruptedException {
        try{
            Assert.assertEquals(Page3.PrintText(),string);
        }catch(AssertionError e){
            System.out.println(e);
        }
    }
}
