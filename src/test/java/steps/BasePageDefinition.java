package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasicPage;

public class BasePageDefinition {

    BasicPage basicPage = new BasicPage();

    @When("User clicks {string} button")
    public void userClicksButton(String arg0) {
        basicPage.clickButton(arg0);
    }

    @Then("content {string} is visible")
    public void contentIsVisible(String arg0) {
        basicPage.contentIsVisible(arg0);
    }
}
