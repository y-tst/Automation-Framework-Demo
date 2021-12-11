package steps;

import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.*;

public class Hooks {

    public static final String HOMEPAGE = "https://grinfer.com/";

    @Before
    public  void openUrl(){
        open(HOMEPAGE);

    }
}
