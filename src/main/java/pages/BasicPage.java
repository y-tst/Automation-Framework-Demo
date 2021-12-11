package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class BasicPage {

    public void clickButton(String text){
        $(By.xpath("//a[contains(text(),'" + text + "')]")).click();
    }
}
