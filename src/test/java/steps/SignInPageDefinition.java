package steps;

import config.UserConfig;
import io.cucumber.java.en.Then;
import pages.SignInPage;

public class SignInPageDefinition {

    SignInPage signInPage = new SignInPage();

    @Then("Input login")
    public void inputLogin() {
        signInPage.inputLogin(UserConfig.USER_LOGIN);
    }

    @Then("Input password")
    public void inputPassword() {
        signInPage.inputPassword(UserConfig.USER_PASSWORD);
    }

    @Then("Clicks Log In button on Log In page")
    public void clicksLogInButtonOnLogInPage() {
        signInPage.clickLoginButton();
    }
}
