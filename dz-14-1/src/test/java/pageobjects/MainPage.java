package pageobjects;

import org.openqa.selenium.WebDriver;

public class MainPage extends AbstractObjects {

    public MainPage(WebDriver driver) {
        super(driver);
        driver.get("https://demoqa.com/elements");
    }
}

