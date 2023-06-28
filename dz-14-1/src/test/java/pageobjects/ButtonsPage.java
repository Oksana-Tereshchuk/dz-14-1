package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ButtonsPage extends AbstractObjects
{
    private final By Buttons = By.xpath("//span[text()='Buttons']");
    private final By ClickMe = By.xpath("//button[text()='Click Me']");
    private final By title = By.xpath("//p[@id='dynamicClickMessage']");
    public ButtonsPage(WebDriver driver) {
        super(driver);
    }
    public void ButtonsElement ()
    {
        getElement(Buttons).click();
    }
    public void ClickMeElement ()
    {
        waitTillAppears(ClickMe);
        getElement(ClickMe).click();
    }
    public String getClickMeText() {
        waitTillAppears(title);
        return getElement(title).getText();
    }
}
