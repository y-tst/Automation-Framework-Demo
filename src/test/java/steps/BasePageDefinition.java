package steps;

import io.cucumber.java.en.When;
import pages.BasicPage;

public class BasePageDefinition {

//    public static final String LOG_IN_BUTTON_CLASS = "sc-izvnbC bFLJJF";

    BasicPage basicPage = new BasicPage();

    @When("User clicks {string} button")
    public void userClicksButton(String arg0) {
        basicPage.clickButton(arg0);
    }
}
