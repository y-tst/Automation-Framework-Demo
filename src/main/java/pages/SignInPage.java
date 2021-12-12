package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage {
    private  SelenideElement loginInput = $(By.cssSelector("#email"));
    private  SelenideElement passwordInput = $(By.cssSelector("#password"));
    private  SelenideElement loginButton = $(By.cssSelector("button[type='submit']"));

    public  void  inputLogin(String text){
        this.loginInput.val(text);
    }

    public  void  inputPassword(String text){
        this.passwordInput.val(text);
    }

    public void clickLoginButton(){
        $(loginButton).click();
    }
}
