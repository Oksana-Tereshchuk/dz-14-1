package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ButtonsPage extends AbstractObjects
{
    private final By buttons = By.xpath("//span[text()='Buttons']");
    private final By clickMe = By.xpath("//button[text()='Click Me']");
    private final By dynamicClickMessage = By.xpath("//p[@id='dynamicClickMessage']");
    public ButtonsPage(WebDriver driver) {
        super(driver);
    }
    private WebElement scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        return element;
    }
    public void clickOnButtonsElement ()
    {
        WebElement buttonElement= getElement(buttons);
        scrollToElement(buttonElement);
        buttonElement.click();
    }
    public void clickOnClickMeElement ()
    {
        waitTillAppears(clickMe);
        getElement(clickMe).click();
    }
    public String getClickMeText() {
        waitTillAppears(dynamicClickMessage);
        return getElement(dynamicClickMessage).getText();
    }
}
