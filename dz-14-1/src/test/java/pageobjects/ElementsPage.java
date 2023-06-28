package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsPage extends AbstractObjects{

    public ElementsPage(WebDriver driver) {
        super(driver);
        driver.get("https://demoqa.com/elements");
    }

}
